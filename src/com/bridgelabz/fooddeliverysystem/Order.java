package com.bridgelabz.fooddeliverysystem;

import java.util.HashMap;

public class Order {

    enum OrderStatus{
        DELIVERED, PENDING;
    }

    HashMap<FoodItem, Integer> orderList = new HashMap<>();
    private Integer totalPrice;
    private String deliveryAddress;
    private Integer orderId;

    @Override
    public String toString() {
        return "Order{" +
                "orderList=" + orderList +
                ", totalPrice=" + totalPrice +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderId=" + orderId +
                ", orderStatus=" + orderStatus +
                '}';
    }

    private OrderStatus orderStatus = OrderStatus.PENDING;

    public int calculateTotalPrice(){
        int totalPrice = orderList.entrySet().stream().map(item -> item.getKey().price * item.getValue())
                .reduce(0, (total, item) -> total + item);
        return totalPrice;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
