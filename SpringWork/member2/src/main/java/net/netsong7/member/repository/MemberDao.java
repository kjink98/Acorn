package net.netsong7.member.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.netsong7.member.model.Member;

public class MemberDao {
	private Map<String, Member> map = new HashMap<String, Member>();
	private static long nextId = 0;
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public Collection<Member> selectAll(){
		return map.values();
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
		System.out.println("test : " + map);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
		System.out.println("update test : " + member.getPassword());
		
	}
}
