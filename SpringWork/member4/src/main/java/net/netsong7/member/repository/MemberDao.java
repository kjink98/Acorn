package net.netsong7.member.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import net.netsong7.member.model.Member;
//4개의 어노테이션을 합쳐서 한 개로 이름(역할)을 달리 하여 만들어놓음
@Repository
public class MemberDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MemberDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Member selectByEmail(String email) {
		String sql = "select * from member where email=?";
		Member mem = jdbcTemplate.query(sql, 
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							ps.setString(1, email);				
						}
					},
					new ResultSetExtractor<Member>() {
						@Override
						public Member extractData(ResultSet rs) throws SQLException, DataAccessException {
							Member member = null;
							if(rs.next()) {
								member = new Member(rs.getString("email"),
										rs.getString("name"),
										rs.getString("password"),
										rs.getTimestamp("registerDate"));
								member.setId(rs.getLong("id"));
							}
							return member;
						}
					});
		
		return mem;
	}
	
	public Collection<Member> selectAll(){
		String sql = "select * from member";
		List<Member> result = jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member dto = new Member(rs.getString("email"),
						rs.getString("name"),
						rs.getString("password"),
						rs.getTimestamp("registerDate"));
				dto.setId(rs.getLong("id"));
				return dto;
			}		
		});
		
		return result;
	}
	
	public void insert(Member member) {
		/* 무명 클래스
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into member(id, email, password, name, " +
						"registerDate) values(seq_id.nextVal,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, member.getEmail());
				stmt.setString(2, member.getPassword());
				stmt.setString(3, member.getName());
				stmt.setTimestamp(4, 
						new Timestamp(member.getRegisterDate().getTime()));

				return stmt;
			}
		});
		*/
		
		/*
		jdbcTemplate.update(
			(Connection con) -> {
				String sql = "insert into member(id, email, password, name, " +
						"registerDate) values(seq_id.nextVal,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, member.getEmail());
				stmt.setString(2, member.getPassword());
				stmt.setString(3, member.getName());
				stmt.setTimestamp(4, 
						new Timestamp(member.getRegisterDate().getTime()));

				return stmt;
			}
		);
		*/
		
		String sql = "insert into member(id, email, password, name, " +
				"registerDate) values(seq_id.nextVal,?,?,?,?)";
		
		/*
		Object[] values = new Object[] {member.getEmail(), 
				member.getPassword(),
				member.getName(), 
				new Timestamp(member.getRegisterDate().getTime())};
		
		jdbcTemplate.update(sql, values);
		*/
		
		jdbcTemplate.update(sql, 	member.getEmail(), 
									member.getPassword(),
									member.getName(), 
				new Timestamp(member.getRegisterDate().getTime()));	
	}
	
	public void update(Member member) {
		String sql = "update member set password=? where email=?";
		
		jdbcTemplate.update(sql, member.getPassword(), member.getEmail());
	}
}













