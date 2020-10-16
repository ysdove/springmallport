package com.jsmall.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsmall.domain.MemberVO;
import com.jsmall.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private BCryptPasswordEncoder crptPassEnc;
	
	@Autowired
	private MemberService service;
	
	//회원가입 뷰
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	private void memberAdd() {
		
		
	}
	
	//회원가입 전송
	@RequestMapping(value="/joinOK", method = RequestMethod.POST)
	public String memberAddOK(MemberVO vo, RedirectAttributes redirect) throws Exception {
		
		logger.info("입력데이터:" + vo.toString());
		
		
		vo.setYjs_password(crptPassEnc.encode(vo.getYjs_password()));
		service.join(vo);
		
		return "redirect:/";
	}
	
	//아이디 중복 체크 ajax요청 //    /member/checkId
	@ResponseBody
	@RequestMapping(value="checkId", method = RequestMethod.POST)
	public ResponseEntity<String> checkId(@RequestParam("yjs_id") String yjs_id) throws Exception {
		
		logger.info("아이디중복체크중");
		ResponseEntity<String> entity = null;
		try {
			int count = service.checkId(yjs_id);
			// count가 0이면 아이디 사용 가능
			
			if(count != 0) {
				//아이디가 존재해서 사용 불가능
				entity = new ResponseEntity<String>("fail", HttpStatus.OK);
			}else {
				//사용가능한 아이디
				entity = new ResponseEntity<String>("success", HttpStatus.OK);				
			}
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST); // 요청이 문제가 있다.
		}
		return entity;
	}
	
	//로그인 뷰
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String memberlogin() {
		
		return "/member/login";
	}
	
}
