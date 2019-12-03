package com.ty.retailer.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderInfo")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private double amountpay;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="rid", nullable = false)
	private RetailerBean retailerBean;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pname",nullable = false)
	private ProductBean productBean;
	
	public RetailerBean getRetailerBean() {
		return retailerBean;
	}
	public void setRetailerBean(RetailerBean retailerBean) {
		this.retailerBean = retailerBean;
	}
	public ProductBean getProductBean() {
		return productBean;
	}
	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmountpay() {
		return amountpay;
	}
	public void setAmountpay(double amountpay) {
		this.amountpay = amountpay;
	}
}
