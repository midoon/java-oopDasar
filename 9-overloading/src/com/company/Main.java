package com.company;

import com.tutorial.Matematika;

public class Main {

    public static void main(String[] args) {

        //overeading constructok
        Player player1 = new Player("joko");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("udin");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overreadign method
        int a = Matematika.tambah(1,2);
        double b = Matematika.tambah(1.5,2);

        System.out.println(a);
        System.out.println(b);
    }
}
