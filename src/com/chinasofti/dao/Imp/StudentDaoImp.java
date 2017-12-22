package com.chinasofti.dao.Imp;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import com.chinasofti.dao.StudentDao;
import com.chinasofti.db.JdbcDao;
import com.chinasofti.entity.Student;

public class StudentDaoImp implements StudentDao{
      QueryRunner qr=new QueryRunner(JdbcDao.getDataSource());
	@Override
	public List<Student> queryAll() {
		try {
			return qr.query("select * from stu", new BeanListHandler<Student>(Student.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int add(Student stu) {
		int i=0;
		try {
			return qr.update("insert into stu (uuid,name,sex,age)values(?,?,?,?)", stu.getUuid(),stu.getName(),stu.getSex(),stu.getAge());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public Student queryOne(String uuid) {
		try {
			return qr.query("select * from stu where uuid=?", new BeanHandler<Student>(Student.class),uuid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int delete(String uuid) {
		int j=0;
		try {
			return qr.update("delete from stu where uuid=?", uuid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return j;
	}
	@Override
	public int update(Student stu){
         int k=0;
         try {
			return qr.update("UPDATE stu SET NAME=?,sex=?,age=? WHERE UUID=?", stu.getName(),stu.getSex(),stu.getAge(),stu.getUuid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return k;
	}
	@Test
	public  void fun() {
		System.out.println(update(new Student("admin4", "admin4", "man", 88)));
	}
}
