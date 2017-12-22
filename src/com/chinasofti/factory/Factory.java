package com.chinasofti.factory;

import com.chinasofti.service.StudentService;
import com.chinasofti.service.Imp.StudentServiceImp;

public class Factory {
	public static StudentService getStudentServiceImp() {
		return new StudentServiceImp();
	}
}
