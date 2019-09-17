package com.sr.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("main")
	public ModelAndView HomeCalling(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("Home");
		return mv;
	}
}