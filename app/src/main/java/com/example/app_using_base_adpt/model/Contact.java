package com.example.app_using_base_adpt.model;

public class Contact {
    private int Id;
    private String name;

    public Contact(int id, String name, String phoneNumber, String address) {
        Id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    private String phoneNumber;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;


}
