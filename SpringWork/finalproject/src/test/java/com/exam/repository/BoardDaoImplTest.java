package com.exam.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exam.domain.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDaoImplTest {
	@Autowired
	private BoardDao boardDao;
	
	@Ignore @Test
	public void writeTest() throws Exception {
		Board dto = new Board("title1", "content1", "홍길동");
		assertTrue(boardDao.write(dto) == 1);
	}
	
	@Test
	public void getListTest() throws Exception {
		List<Board> list = boardDao.getList();
		System.out.println(list);
	}
	
	 @Ignore@Test
	public void readTest() throws Exception {
		Board board = boardDao.read(1);
		assertNotNull(board);
	}
}
