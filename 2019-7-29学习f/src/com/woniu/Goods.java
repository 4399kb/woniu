package com.woniu;

import java.io.File;

public class Goods {
	private int gid;
	private String gname;
	private double gprice;
	private String gphoto;
	
	
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", gphoto=" + gphoto + "]";
	}
	public Goods() {
		super();
	}
	public Goods(int gid, String gname, double gprice, String gphoto) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gphoto = gphoto;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public String getGphoto() {
		return gphoto;
	}
	public void setGphoto(String string) {
		this.gphoto = string;
	}
	
}
