package com.av.hibernate_onetoone_bi;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	@Entity
	public class Person {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private int age;
		
		@OneToOne(mappedBy = "p")
		Aadhaar aadhaar;
		
		public Aadhaar getAadhaar() {
			return aadhaar;
		}
		public void setAadhaar(Aadhaar aadhaar) {
			this.aadhaar = aadhaar;
		}
		public Person()
		{
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		

	}

