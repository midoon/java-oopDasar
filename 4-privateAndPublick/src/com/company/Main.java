package com.company;

class Player{
    private String nama;
    private int level;

    Player(String nama){
        this.nama = nama;
        this.level = 0;
    }

    void display(){
        System.out.println("\nNama: " + this.nama);
        System.out.println("Level: " + this.level);
        upLevel();
    }

    private void upLevel(){
        this.level += 10;
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player player1 = new Player("ucup");
        player1.display();
        player1.display();
        player1.display();

    }
}
