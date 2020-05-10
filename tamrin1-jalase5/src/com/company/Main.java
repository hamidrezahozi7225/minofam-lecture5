package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User user=new User().setName("ali").setAge(20).setAddress("tehran").setMobilenumber(3569871)
                .setNamekarbari(971113011).setTahsilat("lisans").setUsername(112358);

        System.out.println(user.getName()+"\n"+user.getAge()+"\n"+user.getAddress()+"\n"+user.getMobilenumber()+
                "\n"+user.getNamekarbari()+"\n"+user.getTahsilat()+"\n"+user.getUsername());
    }
}
