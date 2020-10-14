package com.jsmall.persistence;

import com.jsmall.domain.MemberVO;

public interface MemberDAO {

	public void join(MemberVO vo) throws Exception;
}
