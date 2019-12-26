package com.tyss.assetmanagement_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
public class Asset {
	
	@Id
	@Column
	private String assetName;
	@Column
	private int assetQuantity;
	@Column
	private String assetDesc;
	
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getAssetQuantity() {
		return assetQuantity;
	}
	public void setAssetQuantity(int assetQuantity) {
		this.assetQuantity = assetQuantity;
	}
	public String getAssetDesc() {
		return assetDesc;
	}
	public void setAssetDesc(String assetDesc) {
		this.assetDesc = assetDesc;
	}
	public EmployeeBean getEmp() {
		return emp;
	}
	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}
	@Exclude
	@OneToOne(mappedBy = "asset")
	private EmployeeBean emp;
}
