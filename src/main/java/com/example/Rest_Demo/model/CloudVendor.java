package com.example.Rest_Demo.model;

public class CloudVendor {

    private String name;
    private String id;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CloudVendor()
    {

    }

    public CloudVendor(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

}
