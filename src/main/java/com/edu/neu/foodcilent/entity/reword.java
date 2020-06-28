package com.edu.neu.foodcilent.entity;

public class reword {
	 private int rewordid;
	 private int forderid;
	 private int customerid;
	 private String createtime;
	 private String fcontent;
	 private String pic;
	public reword(int rewordid, int forderid, int customerid, String createtime, String fcontent, String pic) {
		super();
		this.rewordid = rewordid;
		this.forderid = forderid;
		this.customerid = customerid;
		this.createtime = createtime;
		this.fcontent = fcontent;
		this.pic = pic;
	}
	public reword() {
		
	}
	public int getRewordid() {
		return rewordid;
	}
	public void setRewordid(int rewordid) {
		this.rewordid = rewordid;
	}
	public int getForderid() {
		return forderid;
	}
	public void setForderid(int forderid) {
		this.forderid = forderid;
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
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "reword [rewordid=" + rewordid + ", forderid=" + forderid + ", customerid=" + customerid
				+ ", createtime=" + createtime + ", fcontent=" + fcontent + ", pic=" + pic + "]";
	}
	

}
