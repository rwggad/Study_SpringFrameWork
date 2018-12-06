package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberSearchService {

	/**
	 * 회원 검색 서비스*/
	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() { }
	
	public Member searchMember(String mId) {
		return memberDao.select(mId);
	}
	// Bean이 생성될 때 호출
	public void initMethod(){
		System.out.println("MemberSearchService Bean 생성");
	}

	// Bean이 소멸될 때 호출
	public void destroyMethod(){
		System.out.println("MemberSearchService Bean 소멸");
	}
	
}