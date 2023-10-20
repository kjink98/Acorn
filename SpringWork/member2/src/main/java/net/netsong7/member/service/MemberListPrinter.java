package net.netsong7.member.service;

import java.util.Collection;

import net.netsong7.member.common.MemberPrinter;
import net.netsong7.member.model.Member;
import net.netsong7.member.repository.MemberDao;

public class MemberListPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memDao.selectAll();

		for(Member m : members) {
			printer.print(m);
		}
		System.out.println();
	}
}
