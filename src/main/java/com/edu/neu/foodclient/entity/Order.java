package com.edu.neu.foodcilent.entity;

import java.util.Date;
import java.util.List;

public class Order {
	private Integer orderid;
	private List<OrderDetails> orderDetailsList;
	private String serialnum;
	private Integer clientid;
	private double cost;
	private Integer couponid;
	private Date createtime;
	private Integer paymethod;
	private Integer valid;
	private int state;
	private String remark;

	public Order() {
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderid=" + orderid +
				", serialnum='" + serialnum + '\'' +
				", clientid=" + clientid +
				", cost=" + cost +
				", couponid=" + couponid +
				", createtime=" + createtime +
				", paymethod=" + paymethod +
				", valid=" + valid +
				", state=" + state +
				", remark='" + remark + '\'' +
				'}';
	}

	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}

	public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public String getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Integer getCouponid() {
		return couponid;
	}

	public void setCouponid(Integer couponid) {
		this.couponid = couponid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(Integer paymethod) {
		this.paymethod = paymethod;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}
