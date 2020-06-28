package com.edu.neu.foodcilent.entity;

public class forder {
	private int orderid;
	private int customerid;
	private String createtime;
	private int state;
	private String price;
	private String remark;
	public forder(int orderid, int customerid, String createtime, int state, String price, String remark) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.createtime = createtime;
		this.state = state;
		this.price = price;
		this.remark = remark;
	}
	public forder() {
		
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "forder [orderid=" + orderid + ", customerid=" + customerid + ", createtime=" + createtime + ", state="
				+ state + ", price=" + price + ", remark=" + remark + "]";
	}
	

}
