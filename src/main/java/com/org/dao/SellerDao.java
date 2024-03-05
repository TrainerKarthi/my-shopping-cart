package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.org.dto.Seller;

@Component
@Scope("prototype")
public class SellerDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();

	public void saveAndUpdateSeller(Seller seller) {
		et.begin();
		em.merge(seller);
		et.commit();
	}

	public Seller fetchSellerById(int id) {

		Seller seller = em.find(Seller.class, id);

		return seller;
	}

	public List<Seller> fetchAllSellers() {
		Query query = em.createQuery("select u from Seller u");
		List<Seller> sellers = query.getResultList();

		return sellers;

	}

	public List<Seller> fetchSellerByEmailAndPassword(String email, String password) {
		Query query = em.createQuery("select u from Seller u where u.email=?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<Seller> sellers = query.getResultList();

		return sellers;
	}

}
