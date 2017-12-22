package com.chinasofti.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.chinasofti.entity.Student;
import com.chinasofti.factory.Factory;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
    private Student student=new Student();
	@Override
	public Student getModel() {
		return student;
	}
	public String queryAll(){
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> list = Factory.getStudentServiceImp().queryAll();
		System.out.println("list================="+list);
		request.setAttribute("list", list);
			return "success";
		}
	public String queryOne(){
		Student stu = Factory.getStudentServiceImp().queryOne(student.getUuid());
		 ServletActionContext.getRequest().setAttribute("stu",stu);
		return SUCCESS;
	}
	public String delete(){
		Student stu = Factory.getStudentServiceImp().queryOne(student.getUuid());
		if(stu==null){
			return ERROR;
		}else{
			Factory.getStudentServiceImp().delete(stu.getUuid());
			System.out.println("你好啊");
			return SUCCESS;
		}
	}
}
