package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter name:");
        String name=scanner.next();
        System.out.print("enter password:");
        int pass=scanner.nextInt();
        System.out.print("enter email:");
        String email=scanner.next();
        System.out.print("enter mobile number 09__:");
        int mob=scanner.nextInt();


        Karbar.getKarbar().etelaat(name,pass,email,mob);
        //Karbar.getKarbar().etelaat("ali",23334,"ali78@gmail.com",6907225);
    }
}
