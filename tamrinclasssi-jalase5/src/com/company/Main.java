package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two number");
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        System.out.println("1.'+'");
        System.out.println("2.'-'");
        String a=scanner.next();
        HesabFactory hesabFactory=new HesabFactory();

        Heasab heasab=hesabFactory.gethesab(a);
        heasab.hesab(i,j);
    }
}
