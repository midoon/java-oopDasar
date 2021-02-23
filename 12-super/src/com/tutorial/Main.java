package com.tutorial;

//super class
class Hero {
    private String name;
    private double defencePower;


    Hero(String name,double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("nama : " + this.name);
    }
}

//child classs
class HeroMage extends Hero{

    HeroMage(String name, double defencepower){
        super(name, defencepower);
    }

    HeroMage(String name){
        super(name);
    }
}

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("joko");
        Hero hweo2 = new HeroMage("udin",23);

        
    }
}
