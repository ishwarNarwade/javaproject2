package com.rabbit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.dao.StudDao;
import com.rabbit.model.Stud2;

@Service
public class StudService {
	
	@Autowired
	StudDao sd;
	public List<Stud2> getAllStud() 	{
		return sd.getAllStud();
	}
	public int saveStud(Stud2 s) 
	{
		
		return sd.saveStud(s);
	}
	public int putStud(Stud2 st) 
	{
	
		return sd.putStud(st);
	}
	public Stud2 getStud(int sid) 
	{
		return sd.getStud(sid);
	}
	
	public String deleteStud(int sid) 
	{

		return sd.deleteStud(sid);
	}
	
}
