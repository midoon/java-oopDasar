package com.company;

class Hero{
    String name;

    void show(){
        System.out.println("name: " + this.name);
    }
}

class HeroMgae extends Hero{


}


public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "joko";
        hero1.show();

        HeroMgae hero2 = new HeroMgae();
        hero1.name = "ppenyiihir";
        hero1.show();

    }
}
