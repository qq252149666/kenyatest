package com.kenya.bean;

import java.util.Date;

public class News {
    private Integer newsid;

    private String newstitle;

    private String newsimg0;

    private String newsimg1;

    private String newsauthor;

    private String  newscreatetime;

    private String newstext;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewsimg0() {
        return newsimg0;
    }

    public void setNewsimg0(String newsimg0) {
        this.newsimg0 = newsimg0 == null ? null : newsimg0.trim();
    }

    public String getNewsimg1() {
        return newsimg1;
    }

    public void setNewsimg1(String newsimg1) {
        this.newsimg1 = newsimg1 == null ? null : newsimg1.trim();
    }

    public String getNewsauthor() {
        return newsauthor;
    }

    public void setNewsauthor(String newsauthor) {
        this.newsauthor = newsauthor == null ? null : newsauthor.trim();
    }

    public String getNewscreatetime() {
        return newscreatetime;
    }

    public void setNewscreatetime(String newscreatetime) {
        this.newscreatetime = newscreatetime;
    }

    public String getNewstext() {
        return newstext;
    }

    public void setNewstext(String newstext) {
        this.newstext = newstext == null ? null : newstext.trim();
    }
}