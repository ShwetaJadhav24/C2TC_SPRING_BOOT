package com.sms.shopowner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopOwner")
public class ShopOwner {
	
	private Integer id;
	private String name;
	private Integer shopId;
	private String dob;
	private String address;
	
	public ShopOwner() {
	
	}
	
	public ShopOwner(Integer id, String name, Integer shopId, 
			String dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.shopId = shopId;
		this.dob = dob;
		this.address = address;
}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", shopId=" + shopId + ", dob=" + dob + ", address=" + address
				+ "]";
	}
	
	
}
