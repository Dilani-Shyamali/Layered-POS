package lk.ijse.dep.pos.entity;

import java.sql.Date;

public class CustomEntity2 {

    private int id;
    private Date date;
    private String customerId;
    private String code;
    private int qty;
    private double unitPrice;

    public CustomEntity2() {
    }

    public CustomEntity2(int id, Date date, String customerId, String code, int qty, double unitPrice) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.code = code;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "CustomEntity2{" +
                "id=" + id +
                ", date=" + date +
                ", customerId='" + customerId + '\'' +
                ", code='" + code + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
