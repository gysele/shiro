package org.wxm.core.base.bean;

import java.util.List;

/**
 * <b>标题: </b>页面信息 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b> 1.0 <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-9-3 下午9:00:29 <br/>
 * <b>修改记录: </b>
 */
public class PageInfo<E> {
    private int currentPage; // 当前页码
    private int totalPage; // 总页码
    private int currentRowCount; // 当前列表显示行数
    private int rowFrom; // 当前显示行数自
    private int rowTo; // 当前显示行数至
    private int totalRows; // 总行数
    private List<E> records; // 信息实体

    /**
     * 当前页码
     * 
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * 当前页码
     * 
     * @param currentPage
     *            the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 总页码
     * 
     * @return the totalPage
     */
    public int getTotalPage() {
        if (totalRows > 0) {
            totalPage = totalRows / currentRowCount;
            if (totalRows % currentRowCount > 0) {
                ++totalPage;
            }
        }
        return totalPage;
    }

    /**
     * 总页码
     * 
     * @param totalPage
     *            the totalPage to set
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 当前列表显示行数
     * 
     * @return the currentRowCount
     */
    public int getCurrentRowCount() {
        return currentRowCount;
    }

    /**
     * 当前列表显示行数
     * 
     * @param currentRowCount
     *            the currentRowCount to set
     */
    public void setCurrentRowCount(int currentRowCount) {
        this.currentRowCount = currentRowCount;
    }

    /**
     * 当前显示行数自
     * 
     * @return the rowFrom
     */
    public int getRowFrom() {
        if (currentPage > 0) {
            rowFrom = (currentPage - 1) * currentRowCount;
        }
        return rowFrom;
    }

    /**
     * 当前显示行数自
     * 
     * @param rowFrom
     *            the rowFrom to set
     */
    public void setRowFrom(int rowFrom) {
        this.rowFrom = rowFrom;
    }

    /**
     * 当前显示行数至
     * 
     * @return the rowTo
     */
    public int getRowTo() {
        if (currentPage > 0) {
            rowTo = (currentPage) * currentRowCount + 1;
        }
        if (rowTo > totalRows) {
            rowTo = totalRows + 1;
        }
        return rowTo;
    }

    /**
     * 当前显示行数至
     * 
     * @param rowTo
     *            the rowTo to set
     */
    public void setRowTo(int rowTo) {
        this.rowTo = rowTo;
    }

    /**
     * 总行数
     * 
     * @return the totalRows
     */
    public int getTotalRows() {
        return totalRows;
    }

    /**
     * 总行数
     * 
     * @param totalRows
     *            the totalRows to set
     */
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    /**
     * 信息实体
     * 
     * @return the records
     */
    public List<E> getRecords() {
        return records;
    }

    /**
     * 信息实体
     * 
     * @param records
     *            the records to set
     */
    public void setRecords(List<E> records) {
        this.records = records;
    }
}
