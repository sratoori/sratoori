package com.sr.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sr.demo.dao.AlientDAO;
import com.sr.demo.model.Alien;

//@Controller -- using RestController, you can avoid ResponseBody annotation
@RestController
public class AlientController {
	
	@Autowired
	AlientDAO aliendao;
	
	@RequestMapping("main")
	public String Home () {
		return "Home.jsp";		
	}
	
	@RequestMapping("addAlien")
	public String addAlien (Alien alien) {
		aliendao.save(alien);
		return "Home.jsp";		
	}
	
	@RequestMapping("getAlien")
	public ModelAndView getAlien (@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("ViewAlien.jsp");
		Alien alien = aliendao.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		System.out.println(aliendao.findByAtech("Java"));
		System.out.println(aliendao.findByAidGreaterThan(aid));
		System.out.println(aliendao.getByAtechSortedByAname("Java"));
		return mv;		
	}
	//By ModelView implementation
	@RequestMapping("/getAllAlien")
	@ResponseBody
	public String getAllAlien() {
		return aliendao.findAll().toString();
	}
	
	//By ModelView implementation
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlienById(@PathVariable("aid") int aid) {
		return aliendao.findById(aid).toString();
	}
	
	@RequestMapping(path="/getAllAliens", produces= {"application/xml","application/json"})
	@ResponseBody
	public List<Alien> getAllAliens() {
		return aliendao.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlienByIds(@PathVariable("aid") int aid) {
		return aliendao.findById(aid);
	}
	
	@PostMapping(path="/addAliens", consumes= {"application/json"})
	public Alien addAliens (@RequestBody Alien alien) {
		aliendao.save(alien);
		return alien;		
	}
}
