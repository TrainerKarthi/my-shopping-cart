package com.org.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String productType;

	private long price;

	private String description;

	private String quantity;

	@OneToMany
	private List<Item> items;

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
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

	public List<Item> getItems() {
		return items;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
