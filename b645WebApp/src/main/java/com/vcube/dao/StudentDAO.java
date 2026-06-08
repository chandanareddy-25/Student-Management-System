package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcube.Model.LoginModel;
import com.vcube.Model.Student;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentDAOInterface {
	Connection con=null;
    String status="fail";
	@Override
	public String insertStudent2(Student s) {
		
		try {
			DBConnection dbc=new DBConnection();
			con=dbc.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into studentS2 values(?,?,?,?)");
			ps.setString(1,s.getUsername());
			ps.setString(2,s.getFirstname());
			ps.setString(3,s.getLastname());
			ps.setString(4,s.getPassword());
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
	@Override
	public String selectStudent(LoginModel lm) {
		try {
			DBConnection dbc=new DBConnection();
			con=dbc.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from studentS2 where username=? and password=?");
			ps.setString(1,lm.getUsername());
			ps.setString(2,lm.getPassword());
			ResultSet rs =ps.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
				
			}
			
			if(count>0) {
				status="success";
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
	@Override
	public List<Student> selectAllStudents() {
		List<Student> list=new ArrayList<>();
		try {
		DBConnection dbc=new DBConnection();
		con=dbc.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from studentS2");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Student s=new Student();
			s.setFirstname(rs.getString("firstname"));
			s.setLastname(rs.getString("lastname"));
			s.setUsername(rs.getString("username"));
			s.setPassword(rs.getString("password"));
			list.add(s);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
	@Override
	public String delete(String username) {
		try {
			DBConnection dbc=new DBConnection();
			con=dbc.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from studentS2 where username=?");
			ps.setString(1, username);
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		
		return status;
	}
	@Override
	public Student getStudentByUsername(String username) {
		Student s=new Student();
		try {
			DBConnection dbc=new DBConnection();
			con=dbc.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from studentS2 where username=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				s.setUsername(rs.getString("username"));
				s.setFirstname(rs.getString("firstname"));
				s.setLastname(rs.getString("lastname"));
				s.setPassword(rs.getString("password"));
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		
		return s;
	}
	@Override
	public String update(Student s) {
		try {
			DBConnection dbc=new DBConnection();
			con=dbc.getConnection();
			PreparedStatement ps=con.prepareStatement("update studentS2 set firstname=?,lastname=?,password=? where username=?");
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getPassword());
			ps.setString(4, s.getUsername());
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		
		return status;
	}

}
