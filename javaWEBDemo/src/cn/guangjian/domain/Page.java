package cn.guangjian.domain;

import java.util.List;

public class Page {
    private int currentPage;   //页码
    private int totalCount;  //总记录数
    private int totalPage;   //总页码
    private  List<user> list;  //每页的数据集合
    private int rows;   //每页显示的条数

    public Page() {
    }

    public Page(int currentPage, int totalCount, int totalPage, List<user> list, int rows) {

        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
        this.rows = rows;
    }

    public int getCurrentPage() {

        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<user> getList() {
        return list;
    }

    public void setList(List<user> list) {
        this.list = list;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", rows=" + rows +
                '}';
    }
}
