package com.rabbit.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rabbit.model.Stud2;
import com.rabbit.service.StudService;

@Controller
@RequestMapping("api")
public class Stud_Web_Controller {

	@Autowired
	StudService ss;
	
	List<Stud2> al=new ArrayList();
	
	
	int count;
	

	
	@RequestMapping("getAllStud")
	public ModelAndView getAllStud()
	{
		List<Stud2>al=ss.getAllStud();
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stud");
		mv.addObject("allStuds", al);
		
		
		return mv;
		
	}
	
	@RequestMapping("deleteStud/{sid}")
	public ModelAndView deleteStud(@PathVariable int sid) 
	{
		ss.deleteStud(sid);
		

		return getAllStud();
	}
	
	@RequestMapping("saveStud")
	public ModelAndView saveStud(Stud2 st)
	{
		count =ss.saveStud(st);
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("addstud");
		
		if(count==0)
		{
			mv.addObject("message2", "email Already use");
		}
		else
		{
			mv.addObject("message2", "Student Saved");
		}
		
		
		return mv;
	}
	
	@RequestMapping("updateStud")
	public ModelAndView putStud(Stud2 st)
	{
		//System.out.println("Employee from browser is " + st);
		
		
		ModelAndView mv=new ModelAndView();
		count=ss.putStud(st);
		mv.setViewName("edit");
		
		if(count==0)
		{
			mv.addObject("message2", "email Already use");
		}
		else
		{
			mv.addObject("message2","record updated");	
		}

			
		
		return mv;
	}
	
	
	@RequestMapping("showStud/{sid}")
	public ModelAndView getStud(@PathVariable int sid)
	{
		
		Stud2 st=ss.getStud(sid);
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("edit");
		
		
		mv.addObject("stud",st);
		
		List<Stud2>al=ss.getAllStud();
		//mv.addObject("allStuds", al);
		
		return mv;
	}
	
	
	@RequestMapping("viewStud")
	public ModelAndView viewStud(int sid) 
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("view");
		Stud2 st=ss.getStud(sid);
		
		List<Stud2> list=new ArrayList<>();
		list.add(st);
		
		mv.addObject("stud", list);
		//List<Stud2>al=ss.getAllStud();
		//mv.addObject("Studs", st);
		
		return mv;
		
	}
	
	@RequestMapping("showStud")
	public ModelAndView showStud()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stud");
		mv.addObject("message", "Welcome to Student-Management-System");
		al=ss.getAllStud();
		mv.addObject("allStuds", al);
		return mv;

	}
	
	
	
	@RequestMapping("addstud")
	public String addStud()
	{	
	
		return "addstud";
	
	}
	
	@RequestMapping("view")
	public String view()
	{	
	
		return "view";
	
	}
	
	
	
	
	


	
}
