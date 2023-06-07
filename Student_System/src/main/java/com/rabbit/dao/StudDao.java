package com.rabbit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rabbit.model.Stud2;

@Repository
public class StudDao {
	
	LinkedHashSet<String>linkedhashset=new LinkedHashSet();
	
	//getAll student
	public List<Stud2> getAllStud()
	{
		List<Stud2>lstud=new ArrayList();
		

		
		try {
		Connection cn=Connections.connect(); 
		
		Statement ps=cn.createStatement();
		ResultSet rs=ps.executeQuery("select * from stud2");
		
		while(rs.next())
		{
			int sid=rs.getInt(1);
			String name=rs.getString(2);
			String add=rs.getString(3);
			String email=rs.getString(4);
			String contact=rs.getString(5);
			String gender=rs.getString(6);
			String contry=rs.getString(7);
			
			
			Stud2 sm=new Stud2();
			sm.setSid(sid);
			sm.setName(name);
			sm.setAdd(add);
			sm.setEmail(email);
			sm.setContact(contact);
			sm.setGender(gender);
			sm.setContry(contry);
			
			lstud.add(sm);
			linkedhashset.add(email);
		}
		ps.close();
		cn.close();
		System.out.println(lstud);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lstud;
	}
	
	//save student
	public int  saveStud(Stud2 st) {
		//System.out.println(st);
				int count=0;
		
		//System.out.println(sid+"  "+name+"  "+add+"  "+email+"   "+contact+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		try {
			
			Connection cn=Connections.connect(); 

		PreparedStatement ps=cn.prepareStatement("insert into stud2 values(?,?,?,?,?,?,?)");
		ps.setInt(1, st.getSid());
		ps.setString(2,st.getName());
		ps.setString(3, st.getAdd());
		ps.setString(4,st.getEmail());
		ps.setString(5, st.getContact());
		ps.setString(6, st.getGender());
		ps.setString(7, st.getContry());
			//ps.executeUpdate(sql);
		if(linkedhashset.contains(st.getEmail()))
		{
			System.out.println("email already use");
			
		}else
		{
			ps.executeUpdate();
			linkedhashset.add(st.getEmail());
			count++;
			
		}
		
		ps.close();
		cn.close();
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return count;
	}

	
	//update student
	public int putStud(Stud2 st) {
		int count=0;
		int sid = st.getSid();
		String name = st.getName();
		String add = st.getAdd();
		String email=st.getEmail();
		String contact=st.getContact();
		String gender=st.getGender();
		String contry=st.getContry();

		//System.out.println(sid + " " + name + " " + add);

		
		//Statement ps = cn.createStatement();
		try {
			Connection cn=Connections.connect(); 
			
		
		String updateQuery = "UPDATE stud2 SET `add` = ?, name = ?,email=?, contact=?, gender=?, contry=? WHERE sid = ?";
		PreparedStatement ps = cn.prepareStatement(updateQuery);

		if(linkedhashset.contains(email))
		{
			System.out.println("email already use");
			
		}else
		{
			
			ps.setString(1, add);
			ps.setString(2, name);
			ps.setString(3,email);
			ps.setString(4, contact);
			ps.setString(5, gender);
			ps.setString(6, contry);
			ps.setInt(7, sid);
			int row = ps.executeUpdate();
			count++;
			linkedhashset.add(email);

			
		}
		ps.close();
		cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return count;

	}

	
	//get one stude
	public Stud2 getStud(int sid1) 
	{
		
		Stud2 sm=new Stud2();
	
		try {
			Connection cn=Connections.connect(); 
			
		Statement ps=cn.createStatement();
		ResultSet rs=ps.executeQuery("select * from stud2 where sid="+sid1);
		
		while(rs.next())
		{
			int sid=rs.getInt(1);
			String name=rs.getString(2);
			String add=rs.getString(3);
			String email=rs.getString(4);
			String contact=rs.getString(5);
			String gender=rs.getString(6);
			String contry=rs.getString(7);
			
			sm.setSid(sid);
			sm.setName(name);
			sm.setAdd(add);
			sm.setEmail(email);
			sm.setContact(contact);
			sm.setGender(gender);
			sm.setContry(contry);
			
			
		}
		
		System.out.println();
		ps.close();
		cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return sm;
	}
	
	
	
	//delete
	public String deleteStud(int sid)
	{
		try {
			Connection cn=Connections.connect(); 
			

		Statement ps=cn.createStatement();
		ResultSet rs=ps.executeQuery("select * from stud2 where sid="+sid);
		
		while(rs.next())
		{
			int sid1=rs.getInt(1);
			String name=rs.getString(2);
			String add=rs.getString(3);
			String email=rs.getString(4);
			String contact=rs.getString(5);
				
			linkedhashset.remove(email);
		}

		ps.executeUpdate("delete from stud2 where sid="+sid);
		ps.close();
		cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "<----Data Deleted Successfully---->";

	}




}
