package com.jsmall.service;

import com.jsmall.domain.MemberVO;

public interface MemberService {

	//회원가입
	public void join(MemberVO vo) throws Exception;
	//아이디 중복 체크
	public int checkId(String yjs_id) throws Exception;
}
