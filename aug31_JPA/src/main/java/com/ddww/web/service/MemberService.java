package com.ddww.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddww.web.Member;
import com.ddww.web.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	/* 	findAll()	전체 가져오기
	* 	findOne()	하나 가져오기
	 * 	save()		저장하기 / 수정하기
	 * 	count()		
	 * 	delete()	
	 * 
	 */
	public List<Member> findTop5ByOrderByMnoDesc() {
		return memberRepository.findTop5ByOrderByMnoDesc();
	}

	public int count(String mid, String mpw) {
		return memberRepository.count(mid, mpw);
	}

	public Member findByMid(String mid) {
		return memberRepository.findByMid(mid);
	}

	public Member findByMidAndMpw(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.findByMidAndMpw(member.getMid(), member.getMpw());
	}

	

	public int count(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.count(member.getMid(), member.getMpw());
	}


}
