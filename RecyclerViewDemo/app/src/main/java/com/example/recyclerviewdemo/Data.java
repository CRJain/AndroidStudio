package com.example.recyclerviewdemo;

public class Data {

    private String itemName;
    private String itemNo;

    public Data(String itemName, String itemNo) {
        this.itemName = itemName;
        this.itemNo = itemNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}