package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.org.dto.Orders;

@Component
@Scope("prototype")
public class OrdersDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();

	public void saveAndUpdateOrders(Orders orders) {
		et.begin();
		em.merge(orders);
		et.commit();
	}

	public Orders fetchOrdersById(int id) {

		Orders orders = em.find(Orders.class, id);

		return orders;
	}

	public List<Orders> fetchAllOrderss() {
		Query query = em.createQuery("select u from Orders u");
		List<Orders> orderss = query.getResultList();

		return orderss;

	}

}
