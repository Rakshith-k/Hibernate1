package com.av.comntroller;

import com.av.dao.AadhaarDao;
import com.av.dao.PersonDao;
import com.av.dto.Aadhaar;
import com.av.dto.Person;

public class TestSavePersonAadhaar {

	public static void main(String[] args) {
		
		PersonDao personDao = new PersonDao();
		AadhaarDao aadhaarDao = new AadhaarDao();
		
		Aadhaar a = new Aadhaar();
		a.setFatherName("varshith");
		a.setAadhaarNo("12345 67890");
		aadhaarDao.saveAadhaar(a);
		
		
		Person p = new Person();
		p.setName("Pawan");
		p.setAge(21);
		p.setAadhaar(a);
		personDao.savePerson(p);
		
		
		
		

	}

}