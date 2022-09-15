package com.av.comntroller;

import com.av.dao.PersonDao;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonDao personDao = new PersonDao();
		personDao.getPersonById(3);

	}
}
