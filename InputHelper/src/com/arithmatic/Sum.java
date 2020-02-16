package com.arithmatic;

public class Sum {
    private Integer total;

    public Sum() {
        total = 50;
    }

    public Integer getTotal() {
        return total;
    }

    private void setTotal(Integer total) {
        this.total = total;
    }

    public void addNo(Integer _val) {
        total += _val;
    }

    public void subNo(Integer _val) {
        total -= _val;
    }
}
