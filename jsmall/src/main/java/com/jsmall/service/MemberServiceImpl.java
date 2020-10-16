package com.jsmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsmall.domain.MemberVO;
import com.jsmall.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO dao;
	
	//회원가입
	@Override
	public void join(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.join(vo);
	}

	//아이디 중복 체크
	@Override
	public int checkId(String yjs_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkId(yjs_id);
	}

	
}
