package com.av.comntroller;

import com.av.dao.PersonDao;

public class TestDeletePerson {

	public static void main(String[] args) {
		PersonDao personDao = new PersonDao();
		personDao.deletePerson(2);

	}

}