package com.company;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\njudul : " + this.judul);
        System.out.println("penulis : " + this.penulis);
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Buku buku1 = new Buku("killing komandan","haruki muurakami");
        buku1.display();

        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("addressBuku1 = " + addressBuku1);

        Buku buku2 = buku1;

        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println("addressBuku2 = " + addressBuku2);

        //karena buku1 dan buku2 berada pada address yang sama,
        buku1.judul = "membunuh komandan tore";
        buku1.display();
        buku2.display();

        //memasukkan objek kedalam method
        fungsi(buku2);

        buku1.display();
        buku2.display();

    }


    public static void fungsi(Buku dataBuku){
        String addressBuku2 = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi = " + addressBuku2);
        dataBuku.penulis = "harukii mahalkami";
    }
}
