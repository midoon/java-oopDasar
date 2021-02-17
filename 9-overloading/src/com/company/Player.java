package com.company;

class Player {
    private String name;
    private static int inPlayer;

    Player(String name){
        this.name = name;
        inPlayer++;
    }

    Player(){
        inPlayer++;
        this.name = "Player " + Player.inPlayer;
    }

    void show(){
        System.out.println("nama : " + this.name);
    }

}
