package com.company;

public class HesabFactory {
    public Heasab gethesab(String hesab){
        if(hesab==null){
            return null;
        }
        if (hesab.equalsIgnoreCase("2")){
            return new Minus();
        }
        if (hesab.equalsIgnoreCase("1")){
            return new Plus();
        }
        return null;
    }
}
