package com.tutorial;

class Display{
    static String type = "Display"; //static variable
    private String name;

    //Construction
    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        // type = typeInput; //alternatif 1
        // this.type = typeInput; //alternatif 2
        Display.type = typeInput; //alternatif 3 (recommended)
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Laptop");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

         //kita coba mengganti variable staticnya
        //  Display.type = "Spanduk"; //references dari variable "type" di class "Display"
         display1.setType("Spanduk");


        //tampilkan static variable atau class variable
        System.out.println("\nMenampilkan static variable");
        System.out.println(Display.type);//memasukkan variable kedalam sebuah class
    }
}