package net.netsong7.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import net.netsong7.member.model.Member;

// 4개의 어노테이션을 합쳐서 한 개로 이름(역할)을 달리 하여 만들어놓음
@Repository
public class MemberDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MemberDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Member selectByEmail(String email) {
		return null;
	}

	public Collection<Member> selectAll() {
		return null;
	}

	public void insert(Member member) {
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				String sql = "insert into member(id, email, password, name, " +
//						"registerDate) values(seq_id.nextVal,?,?,?,?)";
//				PreparedStatement stmt = con.prepareStatement(sql);
//				stmt.setString(1, member.getEmail());
//				stmt.setString(2, member.getPassword());
//				stmt.setString(3, member.getName());
//				stmt.setTimestamp(4, 
//						new Timestamp(member.getRegisterDate().getTime()));
//
//				return stmt;
//			}
//		});
		jdbcTemplate.update(
				(Connection con) -> {
				String sql = "insert into member(id, email, password, name, "
						+ "registerDate) values(seq_id.nextVal,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, member.getEmail());
				stmt.setString(2, member.getPassword());
				stmt.setString(3, member.getName());
				stmt.setTimestamp(4, new Timestamp(member.getRegisterDate().getTime()));

				return stmt;
			}
		);
}
	public void update(Member member) {

	}
}
