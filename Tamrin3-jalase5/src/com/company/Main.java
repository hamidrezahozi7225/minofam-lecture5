package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        CarFactory carFactory=new CarFactory();
        System.out.println("1.bmw");
        System.out.println("2.benz");
        System.out.println("3.saipa");
        System.out.println("which one");
        String i=scanner.next();

        Car car=carFactory.getcar(i);
        car.imfomaition();

    }
}
