package com.company;

import java.awt.desktop.AppReopenedEvent;
import java.util.ArrayList;

class Display{
    static String type = "elketrik";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String type){
        //menggunakan namaobjekk.variable soalnya type termasuk static var
        Display.type = type;
    }

    void show(){
        System.out.println("nama\t\t: " +  this.name);
        System.out.println("vae type \t: " + Display.type);
        System.out.println();

    }
}

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name : " +  this.name);
    }

    static void showNumberOfPlayer(){
        System.out.println("Number of player : "+Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }


}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Display display1 = new Display("monitor");
        Display display2 = new Display("spanduk");

        display1.show();
        display2.show();

        //jika static var diubah di salah satu objek, maka class yang sama dengan objek tersbut semua objeknya maka ikut beerubah
        display1.setType("jadul");

        display1.show();
        display2.show();

        System.out.println("\n===== static method ======\n");

        Player player1 = new Player("saitama");
        Player player2 = new Player("all might");
        Player player3 = new Player("joko");

        player1.show();
        player2.show();

        Player.showNumberOfPlayer();
        System.out.println("Names = " + Player.getNames());





    }
}
