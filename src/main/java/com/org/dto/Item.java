package com.org.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity

public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

	private int stockLeft;
	
	private String productType;
	
	private long price;
	
	private String description;
	
	private String quantity;
	
	private int productId;
	
	
	
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private User users;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Orders order;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStockLeft() {
		return stockLeft;
	}

	public String getProductType() {
		return productType;
	}

	public long getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public User getUsers() {
		return users;
	}

	public Orders getOrder() {
		return order;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
}
