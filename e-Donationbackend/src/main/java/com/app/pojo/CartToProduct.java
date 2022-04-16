package com.app.pojo;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tblCartProduct")
public class CartToProduct extends BaseEntity{
	private Integer cartId ;
	private Integer productId ;
	private boolean isInCart = true;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public boolean isInCart() {
		return isInCart;
	}
	public void setInCart(boolean isInCart) {
		this.isInCart = isInCart;
	}
	public CartToProduct(Integer cartId, Integer productId, boolean isInCart) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.isInCart = isInCart;
	}
	public CartToProduct() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
}
