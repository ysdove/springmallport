package com.jsmall.persistence;

import com.jsmall.domain.MemberVO;

public interface MemberDAO {

	//회원가입
	public void join(MemberVO vo) throws Exception;
	//아이디중복체크
	public int checkId(String yjs_id) throws Exception; 
}
