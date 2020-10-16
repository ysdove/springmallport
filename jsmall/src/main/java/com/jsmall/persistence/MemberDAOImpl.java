package com.jsmall.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsmall.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	private final static String NS = "com.jsmall.mappers.MemberMapper";
	
	@Autowired
	private SqlSession session;
	
	//회원가입
	@Override
	public void join(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		session.insert(NS+".join", vo);
	}

	//아이디 중복 체크
	@Override
	public int checkId(String yjs_id) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".checkId", yjs_id);
	}

}
