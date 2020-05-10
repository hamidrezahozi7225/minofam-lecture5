package com.company;

public class User {
    private long namekarbari,mobilenumber;
    private String name,address,tahsilat;
    private int username,age;

    public User setNamekarbari(long namekarbari) {
        this.namekarbari = namekarbari;
        return this;
    }

    public User setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public User setTahsilat(String tahsilat) {
        this.tahsilat = tahsilat;
        return this;
    }

    public User setUsername(int username) {
        this.username = username;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public long getNamekarbari() {
        return namekarbari;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTahsilat() {
        return tahsilat;
    }

    public int getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
