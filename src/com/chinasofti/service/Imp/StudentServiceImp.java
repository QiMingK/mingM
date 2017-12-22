package com.chinasofti.service.Imp;

import java.util.List;

import com.chinasofti.dao.StudentDao;
import com.chinasofti.dao.Imp.StudentDaoImp;
import com.chinasofti.entity.Student;
import com.chinasofti.service.StudentService;

public class StudentServiceImp implements StudentService{
      StudentDao ss=new StudentDaoImp();
	public List<Student> queryAll() {
		return ss.queryAll();
	}

	@Override
	public int add(Student stu) {
		return ss.add(stu);
	}

	@Override
	public Student queryOne(String uuid) {
		return ss.queryOne(uuid);
	}

	@Override
	public int delete(String uuid) {
		return ss.delete(uuid);
	}

	@Override
	public int update(Student stu) {
		return ss.update(stu);
	}
	 
}
