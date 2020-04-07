package com.example.demo;

public class OrderPlaced {

    String eventType;
    Long OrderId;
    int qty;
    Long productId;
    String ProductName;

    public OrderPlaced(){
        //this.eventType = this.getClass().getSimpleName();
        this.eventType = OrderPlaced.class.getSimpleName();
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}
