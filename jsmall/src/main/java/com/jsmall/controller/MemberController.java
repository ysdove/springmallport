package com.jsmall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsmall.domain.MemberVO;
import com.jsmall.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService service;
	
	//회원가입 뷰
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	private String memberAdd() {
		
		return "/member/join";
	}
	
	//회원가입 전송
	@RequestMapping(value="/joinOK", method = RequestMethod.POST)
	public String memberAddOK(MemberVO vo, RedirectAttributes redirect) throws Exception {
		
		logger.info("입력데이터:" + vo.toString());
		
		return "redirect:/";
	}
	
}
