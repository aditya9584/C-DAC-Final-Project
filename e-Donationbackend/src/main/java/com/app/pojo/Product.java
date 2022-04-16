package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblProduct")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product extends BaseEntity {

//	category id many to one 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cat_id")
	@JsonIgnore
	private Category category ;
	
//	vendor id 
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user ;
	

	
	@Column(length = 20 ,nullable = false)
	private String name ;
	
	@Column(length = 64 ,nullable = false)
	private String description ;
	
//	image 
	@Column(length = 100)
	private String image ;
	
	@Column(nullable = false)
	private int price ; 
	
	@Column
	private float discount;
	
	@Column(nullable = false)
	private boolean isActive = true;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Category category, User user, String name, String description, String image, int price,
			float discount, boolean isActive) {
		super();
		this.category = category;
		this.user = user;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.discount = discount;
		this.isActive = isActive;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
