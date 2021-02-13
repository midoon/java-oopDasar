package com.tutorial;

class Mahasiswa{
    String nama;
    String jurusan;
    String paacr;
    long NIM;

    Mahasiswa(String nama, String jurusan, String pacar, long NIM){
        this.nama = nama;
        this.jurusan = jurusan;
        this.paacr = pacar;
        this.NIM = NIM;
    }

    void printID(){

        String nama = this.nama;
        String jurusan = this.jurusan;
        String pacar = this.paacr;
        long NIM = this.NIM;

        System.out.println("===============================");
        System.out.println("nama saya = " + nama);
        System.out.println("jurusan saya = " + jurusan);
        System.out.println("ppacar saya adalah = " + pacar);
        System.out.println("NIM saya = " + NIM);
        System.out.println();
    }

}

class InfoMhs{
    String hobi;
    String cita2;

    InfoMhs(String hobi, String cita2){
        this.hobi = hobi;
        this.cita2 = cita2;
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Harun Ahmad","Teknik Informatika","Ima Nur Firda Almaida",205152424);
        mhs1.printID();

        Mahasiswa mhs2 = new Mahasiswa("joko","teknik perteknikan","juniver",696969);
        mhs2.printID();

    }
}
