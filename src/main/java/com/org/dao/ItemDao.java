package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.org.dto.Item;

@Component
@Scope("prototype")
public class ItemDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();

	public void saveAndUpdateItem(Item item) {
		et.begin();
		em.merge(item);
		et.commit();
	}

	public Item fetchItemById(int id) {

		Item item = em.find(Item.class, id);

		return item;
	}

	public List<Item> fetchAllItems() {
		Query query = em.createQuery("select u from Item u");
		List<Item> items = query.getResultList();

		return items;

	}
}
