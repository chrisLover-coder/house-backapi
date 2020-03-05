package com.team.house.housebackapi.utils;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-03-01 16:33
 **/
public class PagePrameter {
    private Integer page = 1;
    private Integer pageSize = 5;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
