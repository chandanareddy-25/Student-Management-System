package com.vcube.dao;

import java.util.List;

import com.vcube.Model.LoginModel;
import com.vcube.Model.Student;

public interface StudentDAOInterface {
	
	public String insertStudent2(Student s);
	public String selectStudent(LoginModel lm);
	public List<Student>  selectAllStudents();
	public String delete(String username);
	public Student getStudentByUsername(String username);
	public String update(Student s);

}
