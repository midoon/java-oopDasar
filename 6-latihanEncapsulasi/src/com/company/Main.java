package com.company;

class Player{

    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    //object member
    private Armor armor;
    private Weapon weapon;

    Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.totalHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("\nName\t\t: "+this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Max Health\t: "+ getHealth() + " / " +this.totalHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Is Alive\t: " + this.isAlive);
    }

    public void attack(Player opponent){
        //hitung damage
        int damage = this.getAttackPower();
        //print event
        System.out.println("\nName: "+this.name + "is attacking : "+ opponent.getName()+ " with " + damage+ " damage");
        //attack si opponent
        opponent.defence(damage);
        this.levelUp();
    }

    public void defence(int damage){

        //recieve damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power " + defencePower);

        if (damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }

        System.out.println( "damage earnd " + deltaDamage);

        this.totalDamage += deltaDamage;

        //check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.totalHealth();
        }


        this.display();

    }

    private int getAttackPower(){
        return this.baseAttack  + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int totalHealth(){
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddhealth();
    }


}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String nmae, int strength, int health){
        this.name = nmae;
        this.strength = strength;
        this.health = health;
    }

    public int getAddhealth(){
        return this.strength*10+this.health;
    }


    public int getDefencePower(){
        return this.strength*2;
    }

}

public class Main {

    public static void main(String[] args) {

        //weapon
        Weapon weapon1 = new Weapon("pedang",10);
        Weapon weapon2 = new Weapon("pecut",40);

        //Armor
        Armor armor1= new Armor("baju besii",5,100);
        Armor armor2= new Armor("gaun",1,40);


        //player
        Player player1 = new Player("marni");
        Player player2 = new Player("juniver");

        //set atribut
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);


    }
}
