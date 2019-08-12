package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	

		public Employee(long id, String name, int age, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
	}

		public Employee() {
		super();
	}

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		@Column(name = "name")
		private String name;

		@Column(name = "age")
		private int age;

		@Column(name = "active")
		private boolean active;


		public long getId() {
			return id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return this.age;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + "]";
		}
}
