package com.tutorial;

class Player{
    String nama;
    double darah;
    int level;

    Senjata senjata;
    Armor armor;

    Player(String nama, double darah, Senjata senjata, Armor armor){
        this.nama = nama;
        this.darah = darah;
        this.senjata = senjata;
        this.armor = armor;
    }

    void diispplay(){
        System.out.println("\nplayer = " + this.nama);
        System.out.println("HP = " + this.darah);
        senjata.display();
        armor.display();
    }

    void attack(Player musuh){

        double damage;

        if (this.senjata.attackPower > musuh.armor.defencePpower){
            damage = this.senjata.attackPower - musuh.armor.defencePpower;
        } else {
            damage = 0;
        }

        musuh.darah -= damage;

        System.out.println();
        System.out.println(this.nama + " menyerang " + musuh.nama + " dengan damage : " + damage);

        diispplay();
        musuh.diispplay();
    }


}

class Senjata{
    String nama;
    double attackPower;

    Senjata(String nama, double attackPower){
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("senjata = " + this.nama + " , attackPower = " + this.attackPower);
    }
}

class Armor{
    String nama;
    double defencePpower;

    Armor(String nama, double defencePower){
        this.nama = nama;
        this.defencePpower = defencePower;
    }

    void display(){
        System.out.println("armor = " + this.nama + " , attackPower = " + this.defencePpower);
    }
}



public class Main {
    public static void main(String[] args) {


        //membubat objek senjata
        Senjata pedang = new Senjata("pedang",15);
        Senjata tembak = new Senjata("tembak",20);

        //membuat objek armor
        Armor jirah = new Armor("jirah",10);
        Armor jaket = new Armor("jaket",5);

        //buat player
        Player player1 = new Player("ucup",100,pedang,jirah);
        Player player2 = new Player("otong",100,tembak,jaket);


        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);


    }
}
