package net.netsong7.member.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.netsong7.member.model.Member;
import net.netsong7.member.model.RegisterRequest;
import net.netsong7.member.repository.MemberDao;

//4개의 어노테이션을 합쳐서 한 개로 이름(역할)을 달리 하여 만들어놓음
@Service("memberRegSvc")
public class MemberRegisterService {
	private MemberDao memberDao;
	
	// 기본 생성자
	public MemberRegisterService() {}
	// 생성자
	@Autowired
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	@Autowired
	public void regist(RegisterRequest req) {
		// 같은 이메일이 있는지 여부 검사
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			System.out.println("같은 이메일이 있습니다.");
			return;
		}
		Member newMem = new Member(req.getEmail(), req.getName(), 
				req.getPassword(), new Date());
		memberDao.insert(newMem);
	}
	
	
}
