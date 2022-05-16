package com.capg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Product {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private long productId;
	
	@Column(name="product_name", nullable=false)
	private String productName;
	
	@Column(name="product_price", nullable=false)
	private double productPrice;
	
	@Column(name="product_description")
	private String description;
	
	//@ManyToOne(cascade=CascadeType.PERSIST)
	//@JoinColumn(name="vendor_id")
	//private Vendor vendor;
	
	public Product() {
		super();
	}
	
	public Product(String productName, double productPrice, String Description) {
		super();
		this.productName=productName;
		this.productPrice=productPrice;
		this.description=description;
	
	}
	public String getDescription() {
		return description;
     }
	
	//public Vendor getVendor() {
		//return vendor;
	//}
	//public void setVendor(Vendor vendor) {
		//this.vendor=vendor;
	//}
	public void setDescription(String description) {
		this.description=description;
	}
	
	public long getProductId(){
		return productId;
	}
	public void getProductId(long productId) {
		this.productId=productId;
		}
	
	public String getItemName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", description=" + description + "]";
	}
	
	}
