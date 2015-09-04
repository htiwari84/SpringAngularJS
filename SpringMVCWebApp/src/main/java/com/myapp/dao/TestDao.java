package com.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dto.TestDTO;

@Repository
public class TestDao {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Transactional
	public void saveObject(TestDTO testDTO) {
		Session session=sessionFactory.getCurrentSession();
		session.save(testDTO);
		
	}
}
