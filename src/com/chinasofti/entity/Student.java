package com.chinasofti.entity;

public class Student {
        private int id;
        private String uuid;
        private String name;
        private String sex;
        private int age;
		public Student() {
			super();
		}
		public Student(int id, String uuid, String name, String sex, int age) {
			super();
			this.id = id;
			this.uuid = uuid;
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", uuid=" + uuid + ", name=" + name
					+ ", sex=" + sex + ", age=" + age + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUuid() {
			return uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Student(String uuid, String name, String sex, int age) {
			super();
			this.uuid = uuid;
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		
}
