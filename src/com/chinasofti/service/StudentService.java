package com.chinasofti.service;

import java.util.List;
import com.chinasofti.entity.Student;

public interface StudentService {
	 public List<Student> queryAll();
     public int add(Student stu);
     public Student queryOne(String uuid);
     public int delete(String uuid);
     public int update(Student stu);
}
