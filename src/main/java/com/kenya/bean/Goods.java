package com.kenya.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private String goodsimgs;

    private String goodsimg1;

    private String goodsimg2;

    private String goodsimg3;

    private String goodsimg4;

    private Float goodsprice;

    private String goodsusername;

    private String goodsphone;

    private Integer userid;

    private String goodsdesc;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date goodsdate;
    
    private User user;
    

   
	public Date getGoodsdate() {
		return goodsdate;
	}

	public void setGoodsdate(Date goodsdate) {
		this.goodsdate = goodsdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsimgs() {
        return goodsimgs;
    }

    public void setGoodsimgs(String goodsimgs) {
        this.goodsimgs = goodsimgs == null ? null : goodsimgs.trim();
    }

    public String getGoodsimg1() {
        return goodsimg1;
    }

    public void setGoodsimg1(String goodsimg1) {
        this.goodsimg1 = goodsimg1 == null ? null : goodsimg1.trim();
    }

    public String getGoodsimg2() {
        return goodsimg2;
    }

    public void setGoodsimg2(String goodsimg2) {
        this.goodsimg2 = goodsimg2 == null ? null : goodsimg2.trim();
    }

    public String getGoodsimg3() {
        return goodsimg3;
    }

    public void setGoodsimg3(String goodsimg3) {
        this.goodsimg3 = goodsimg3 == null ? null : goodsimg3.trim();
    }

    public String getGoodsimg4() {
        return goodsimg4;
    }

    public void setGoodsimg4(String goodsimg4) {
        this.goodsimg4 = goodsimg4 == null ? null : goodsimg4.trim();
    }

    public Float getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Float goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsusername() {
        return goodsusername;
    }

    public void setGoodsusername(String goodsusername) {
        this.goodsusername = goodsusername == null ? null : goodsusername.trim();
    }

    public String getGoodsphone() {
        return goodsphone;
    }

    public void setGoodsphone(String goodsphone) {
        this.goodsphone = goodsphone == null ? null : goodsphone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }
}