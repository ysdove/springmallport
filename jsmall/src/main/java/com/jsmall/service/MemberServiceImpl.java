package com.jsmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsmall.domain.MemberVO;
import com.jsmall.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Override
	public void join(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.join(vo);
	}

	
}
