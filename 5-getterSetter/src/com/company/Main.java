package com.company;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    Data(int intPublic){
        this.intPublic = intPublic;
        intPrivate = 0;
    }


    //getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }


}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Data object = new Data(5);

        //read data publiic
        System.out.println(object.intPublic);
        //write data public
        object.intPublic = 7;
        System.out.println(object.intPublic);

        //only read
        double getData = object.getIntPrivate();
        System.out.println(getData);

        //only write
        object.setDoublePrivate(9);

    }
}
