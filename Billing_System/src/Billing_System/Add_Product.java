package Billing_System;

public class Add_Product {
    private String product_name;
    private int product_code;
    private double product_price;
    private byte product_discount;
    private float QTY;
    private double total;
    public Add_Product(String Name, int code, double price, float quantity, byte discount, double total){
        this.product_name = Name;
        this.product_code = code;
        this.product_price = price;
        this.QTY = quantity;
        this.product_discount = discount;
        this.total =  total;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public byte getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(byte product_discount) {
        this.product_discount = product_discount;
    }

    public float getQTY() {
        return QTY;
    }

    public void setQTY(float QTY) {
        this.QTY = QTY;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String toString(){
        String display =product_name+" "+product_code+" "+QTY+" "+product_discount+" "+total;
        return display;
    }
}
