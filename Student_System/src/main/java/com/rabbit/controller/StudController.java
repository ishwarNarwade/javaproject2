package com.rabbit.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.model.Stud2;
import com.rabbit.service.StudService;

@RestController
public class StudController {
	
	@Autowired
	StudService ss;
	
	@GetMapping("getAllStud")
	public List<Stud2> getAllStud() throws ClassNotFoundException, SQLException
	{
		return ss.getAllStud();
	}
	
	@PostMapping("saveStud")
	public int saveStud(@RequestBody Stud2 s) throws ClassNotFoundException, SQLException
	{
		return ss.saveStud(s);
	}

	@PutMapping("putStud")
	public int putStud(@RequestBody Stud2 st) throws ClassNotFoundException, SQLException
	{
		return ss.putStud(st);
	}
	

	@GetMapping("getStud/{sid}")
	public Stud2 getStud(@PathVariable int sid) throws ClassNotFoundException, SQLException
	{
		return ss.getStud(sid);
	}
	
	@DeleteMapping("deleteStud/{sid}")
	public String deleteStud(@PathVariable int sid) throws ClassNotFoundException, SQLException
	{
		return ss.deleteStud(sid);
	}

}
