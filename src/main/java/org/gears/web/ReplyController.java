package org.gears.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReplyController {
	
	
	@GetMapping("/reply")
	public void getReply(){
		
		System.out.println("sadhkajdk");
	}
	
	@GetMapping("/page")
	public void getReply2(){
		
		System.out.println("afljaghld");
	}
	
}
