package org.gears.review;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Map;

import javax.inject.Inject;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
@WebAppConfiguration
public class ControllerTest {
	
	@Inject
	WebApplicationContext ctx;
	
	MockMvc mock;
	
	
	
	@Before
	public void dd(){
		
		mock = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void sdsdd() throws Exception{
		
		Map<String,Object>map = mock.perform(get("/board/list")).andReturn().getModelAndView().getModel();
		
		System.out.println(map);
		
		
	}
	
}
