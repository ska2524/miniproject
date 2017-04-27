package org.gears.review;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.gears.domain.Criteria;
import org.gears.domain.ReviewVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class reviewTest {

	@Inject
	DataSource ds;
	
	@Inject
	SqlSessionTemplate sess;
	
	
	@Test
	public void connectionTest(){
		
		try {
			Connection con=  ds.getConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
	
	@Test
	public void insertTest(){
		
		ReviewVO vo = new ReviewVO();
		
		
		vo.setTitle("ttttt");
		vo.setContent("t");
		
		vo.setWriter("t");
		
		
		
		sess.insert("org.gears.persistence.ReviewDAO.insert",vo);
		
		
	}
	
	@Test
	public void count(){
		
		sess.selectOne("org.gears.persistence.ReviewDAO.getTotal");
	}
	
	@Test
	public void getList(){
		
		Criteria cri= new Criteria();
		
		
		
		
		sess.selectList("org.gears.persistence.ReviewDAO.getlist",cri);
	}
	
	

	
}
