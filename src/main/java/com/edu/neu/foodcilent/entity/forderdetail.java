package com.edu.neu.foodcilent.entity;

public class forderdetail {
	private int detailid;
	private int forderid;
	private int foodid;
	private int fdnumber;
	public forderdetail(int detailid, int forderid, int foodid, int fdnumber) {
		super();
		this.detailid = detailid;
		this.forderid = forderid;
		this.foodid = foodid;
		this.fdnumber = fdnumber;
	}
	public forderdetail() {
		
	}
	public int getDetailid() {
		return detailid;
	}
	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}
	public int getForderid() {
		return forderid;
	}
	public void setForderid(int forderid) {
		this.forderid = forderid;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public int getFdnumber() {
		return fdnumber;
	}
	public void setFdnumber(int fdnumber) {
		this.fdnumber = fdnumber;
	}
	@Override
	public String toString() {
		return "forderdetail [detailid=" + detailid + ", forderid=" + forderid + ", foodid=" + foodid + ", fdnumber="
				+ fdnumber + "]";
	}
	

}
