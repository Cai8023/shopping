package com.pojo;

import java.util.List;

public class Page<T> {

    /**
     * 默认的页尺寸，即一页显示的信息数
     */
    public static final Integer PAGE_SIZE = 5;

    /**
     * 当前页码
     */
    private Integer pageNo;

    /**
     * 总页码
     */
    private Integer pageTotal;

    /**
     * 当前页显示数量，默认为5
     */
    private Integer pageSize = PAGE_SIZE;

    /**
     * 总的记录数
     */
    private Integer pageTotalCount;

    /**
     * 当前的页数据
     */
    private List<T> items;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Page{");
        sb.append("pageNo=").append(pageNo);
        sb.append(", pageTotal=").append(pageTotal);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", pageTotalCount=").append(pageTotalCount);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Page(Integer pageNo, Integer pageTotal, Integer pageSize, Integer pageTotalCount, List<T> items) {
        this.pageNo = pageNo;
        this.pageTotal = pageTotal;
        this.pageSize = pageSize;
        this.pageTotalCount = pageTotalCount;
        this.items = items;
    }

    public Page() {
    }


}