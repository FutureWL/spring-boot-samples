package io.github.futurewl;

import java.util.List;

public class DataPackage {

    // 列表数据
    private List datas;

    // 当前页
    private int currentPage;

    // 每页的数据大小
    private int pageSize = 5;

    // 总数据量
    private int dataCount;

    // 总页数，由总数据量与每页的数据量计算得出
    private int pageCount;

    public List<Book> getDatas() {
        return datas;
    }

    public void setDatas(List<Book> datas) {
        this.datas = datas;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getDataCount() {
        return dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    /**
     * 计算总页数
     */
    public void setPageCount() {
        if (dataCount % pageSize == 0) {
            this.pageCount = dataCount / pageSize;
        } else {
            this.pageCount = dataCount / pageSize + 1;
        }
    }
}
