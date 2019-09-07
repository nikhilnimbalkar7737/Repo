package com.web.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.web.Alien;
import com.web.dao.AlienRepo;
@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
public String home()
{
	return "Home";
}
	/*
	 * @PostMapping("/addAlien") public String addAlien(Alien alien) {
	 * repo.save(alien); return "Home"; }
	 */
	
	
	@PostMapping("/addAlien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	

	@PutMapping("/updateAlien")
	public Alien updateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping("/DeleteAlien/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		repo.delete(repo.getOne(aid));
		return "Deleted...";
	}
	
	
	
	
	@RequestMapping("/showAlien")
	public ModelAndView etAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("showAliens");
		Alien alien=repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findBytech("java"));
		System.out.println(repo.findByaidGreaterThan(3));
		System.out.println(repo.findBytechSorted("java"));
		System.out.println(repo.findAll());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping(path="/getAlien",produces={"application/json"})
	@ResponseBody
	//@Procedure("application/json")
	public List<Alien> getAlien()
	{
		return repo.findAll();
		//return "Home";
	}
	
	@RequestMapping("/getAlienbyId/{aid}")
	@ResponseBody
	
	public Optional<Alien> getAlien(@PathVariable int aid)
	{
		return repo.findById(aid);
		//return "Home";
	}
	
	
	
	
	/*
	 * @RequestMapping("/updateAlien") public String updateAlien(Alien alien) {
	 * repo.save(alien); return "Home"; }
	 */
	
	
}
