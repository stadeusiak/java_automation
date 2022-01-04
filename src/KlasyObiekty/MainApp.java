package KlasyObiekty;

import TypyDanych.InstrukjceSterujace;

public class MainApp {
    public static void main(String[] args) {

        // Obiekty opisują z czego będzie składał się dany obiekt

        User Szymon = new User();
        MainApp Mati = new MainApp();
        InstrukjceSterujace abc = new InstrukjceSterujace();

User Szymon1 = new User("Szymon","QWERT","asd@",23,true);
        System.out.println(Szymon1.firstNAme+" "+Szymon1.lastName);



        User Tadeusz = new User();

        System.out.println(Szymon.firstNAme);
        System.out.println(Tadeusz.email);
        System.out.println(Tadeusz.isAdult);

        Szymon.firstNAme = "Szymon";
        Szymon.lastName = "XYZ";
        Szymon.email = "sxyz@gmail.com";
        Szymon.age = 34;
        Szymon.isAdult = true;

        System.out.println(Szymon.firstNAme);
        System.out.println(Tadeusz.firstNAme);

        Tadeusz.firstNAme = "Tadzio";
        Tadeusz.lastName = "Qwerty";
        Tadeusz.email = "tadzopqwert@gmail.com";
        Tadeusz.age = 18;
        Tadeusz.isAdult = true;

        System.out.println(Tadeusz.firstNAme + " " + Tadeusz.lastName);
        System.out.println(Tadeusz.firstNAme + " " + Tadeusz.lastName + " " + Tadeusz.email + " " + Tadeusz.age);

        System.out.println(Szymon.firstNAme + " " + Szymon.lastName);
        System.out.println(Szymon.firstNAme + " " + Szymon.lastName + " " + Szymon.email + " " + Szymon.age);

        System.out.println("-------");
        Szymon.getFullName();
        Szymon.getAllInfo();

        System.out.println("-------");

        Szymon.getUserage();

        int userage = Szymon.getUserage();

        System.out.println(userage);

        Szymon.isuserAdult();
        boolean userAdult = Szymon.isuserAdult();
        System.out.println("Czy Szym jest dorosły: " + userAdult);

        boolean isTadzioAdult = Tadeusz.isuserAdult();
        System.out.println("Czy Tadzio jest dorosły: " + isTadzioAdult);

// MEtoda z parametrem
        Szymon.greetins("Sajmonides");

        // MEtoda z parametrami
        Szymon.howOldAreYou("Szymonides", 34);

//Metoda z parametrem int i return

        Szymon.yourAgePlus10(13);
        int szymonAgeplus10 = Szymon.yourAgePlus10(13);
        System.out.println(szymonAgeplus10);

        int tadeuszAgeplus10 = Tadeusz.yourAgePlus10(20);
        System.out.println(tadeuszAgeplus10);

//metody przeciążeniowe
        Szymon.greetings(13,"asd","Stolarska");
        int szymgreet = Szymon.greetings(13,"Ad","asd");


        int szymgretgender =  Szymon.greetins("Stolarska","Male",15);
        System.out.println(szymgretgender);








    }
}
