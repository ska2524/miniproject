package org.gears.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import javax.inject.Inject;

import org.gears.domain.Criteria;
import org.gears.domain.PageMaker;
import org.gears.domain.ReviewVO;
import org.gears.service.ReplyService;
import org.gears.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.fabric.Response;



@Controller
@RequestMapping("/board")
public class listController {
	
	@Inject
	ReviewService service;
	
	@Inject
	ReplyService rservice;
	
	
	@GetMapping("/list")
	public void list(@ModelAttribute("cri")Criteria cri, Model model){
		
		
		List<ReviewVO> list = service.getList(cri);
		
		model.addAttribute("list", list);
		model.addAttribute("pageMaker",new PageMaker(cri, service.countTotal()));
		
		
		
	}
	
	@GetMapping("/view")
	public void view(@ModelAttribute("cri") Criteria cri, int rno, Model model){
		
		
		
		System.out.println("hhhhhh");
		ReviewVO read = service.readone(rno);
		
		model.addAttribute("ReviewVO", read);
		model.addAttribute("rlist",rservice.getList(cri));
		model.addAttribute("pageMaker",new PageMaker(cri, rservice.countTotal()));
		
		
	}
	
	@GetMapping("/register")
	public void register(){
		
		
		
		
	}
	

	@PostMapping("/register")
	public String register2(ReviewVO vo){
		
		
		
			
		
		
		System.out.println(vo.getPname());
		
		
	
		
		service.create(vo);
		
		
		return "redirect:/board/list";
	}
	
	/*
	@GetMapping("list/{current}")
	public void list1(@PathVariable("current") Integer current, Criteria cri ){
		
		cri.setSkip(current);
		
		List<ReviewVO> list = service.getList(cri);
		
		System.out.println(current);
	}
	*/

	
	
}
