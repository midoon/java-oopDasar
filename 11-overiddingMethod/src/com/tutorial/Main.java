package com.tutorial;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "kuking";
        hero1.show();

        HeroMage hero2 = new HeroMage();
        hero2.name = "behhh" + 1;
        hero2.magicPower = 8;
        hero2.show();


    }
}
