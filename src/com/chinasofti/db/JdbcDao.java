package com.chinasofti.db;
import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcDao {
      private static  ComboPooledDataSource datasource =new ComboPooledDataSource();
       private static  Connection con =null;
       public static ComboPooledDataSource getDataSource(){
          return datasource;
        }
       public static Connection getConnection(){
		   try {
		 con =  datasource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	   return  con;
       }
       public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
