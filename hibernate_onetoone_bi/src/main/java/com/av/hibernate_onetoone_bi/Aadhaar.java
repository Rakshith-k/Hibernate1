package com.av.hibernate_onetoone_bi;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

	@Entity
	public class Aadhaar {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String fatherName;
		private String aadhaarNo;
		
		public Person getP() {
			return p;
		}
		
		public void setP(Person p) {
			this.p = p;
		}
		
		@OneToOne
		@JoinColumn
		Person p;
		
		public Aadhaar()
		{
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFatherName() {
			return fatherName;
		}
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}
		public String getAadhaarNo() {
			return aadhaarNo;
		}
		public void setAadhaarNo(String aadhaarNo) {
			this.aadhaarNo = aadhaarNo;
		}
		

	}

