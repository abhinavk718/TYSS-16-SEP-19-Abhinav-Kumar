package com.tyss.springmvcassesment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class Order 
{
	@Id
	@Column
	private int orderId;
	@Column
	private String productName;
	@Column
	private double perUnitPrice;
	@Column
	private int quantity;
	@Column
	private double payableAmount;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPerUnitPrice() {
		return perUnitPrice;
	}
	public void setPerUnitPrice(double perUnitPrice) {
		this.perUnitPrice = perUnitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}
}