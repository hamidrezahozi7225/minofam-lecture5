package com.company;



public class Karbar {
    private static Karbar karbar;
    private Karbar(){};

    public synchronized static Karbar getKarbar() {
        if(karbar==null){
            karbar=new Karbar();
        }
        return karbar;
    }

    public void etelaat(String name, int password, String email, int mobilenumber){
        System.out.println(name);
        System.out.println(password);
        System.out.println(email);
        System.out.println(mobilenumber);

    }

}
