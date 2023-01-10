package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch05.service.User2Service;
import kr.co.ch05.vo.User2VO;

@Controller
public class User2Controller {

	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/list")
	public String list(Model model) {
		
		List<User2VO> users = service.selectUser2s();
		
		model.addAttribute("users", users);
		
		return "/user2/list";
	}
	
}
