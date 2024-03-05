package com.org.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private int stockLeft;

	private String productType;

	private long price;

	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Seller seller;

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

	

	public Seller getSeller() {
		return seller;
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

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
}
