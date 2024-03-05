package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.org.dto.Product;

@Component
@Scope("prototype")
public class ProductDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();

	public void saveAndUpdateProduct(Product product) {
		et.begin();
		em.merge(product);
		et.commit();
	}

	public Product fetchProductById(int id) {

		Product product = em.find(Product.class, id);

		return product;
	}

	public List<Product> fetchAllProducts() {
		Query query = em.createQuery("select u from Product u");
		List<Product> products = query.getResultList();

		return products;

	}
}
