package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.org.dto.User;

@Component
@Scope("prototype")
public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	public void saveAndUpdateUser(User user)
	{
		et.begin();
		em.merge(user);
		et.commit();
	}
	
	public User fetchUserById(int id) {
		
		User user = em.find(User.class, id);
		
		return user;
	}
	
	public List<User> fetchAllUsers(){
		Query query = em.createQuery("select u from User u");
		List<User> users = query.getResultList();
		
		return users;
		
	}
	
	public List<User> fetchUserByEmailAndPassword(String email, String password){
		Query query = em.createQuery("select u from User u where u.email=?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> users = query.getResultList();
		
		return users;
	}
}
