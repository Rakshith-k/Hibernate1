package com.av.comntroller;

import com.av.dao.PersonDao;
import com.av.dto.Aadhaar;
import com.av.dto.Person;

public class TestUpdatePerson {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("karthik");
		person.setAge(25);

		Aadhaar aadhar=new Aadhaar();
		aadhar.setFatherName("gurukiran");
		aadhar.setAadhaarNo("2332 2342 3434");
		PersonDao persondao=new PersonDao();
		
		persondao.updatePersonById(3, person, aadhar);

		}

}