package com.team.house.housebackapi.utils;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-03-04 13:49
 **/
public class HouseCondition extends PagePrameter {
    private String title;
    private String startPrice;
    private String endPrice;
    private String tid;
    private String did;
    private String sid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
