package entity;

public class PageResult <t>{
    private long total;
    private List<t> rows;

    public PageResult() {
    }

    public PageResult(long total, List<t> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<t> getRows() {
        return rows;
    }

    public void setRows(List<t> rows) {
        this.rows = rows;
    }
}
