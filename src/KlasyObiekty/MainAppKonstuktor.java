package KlasyObiekty;

public class MainAppKonstuktor {

    public static void main(String[] args) {

        UserKonstruktor Szymon2 = new UserKonstruktor("Szymon","ASDF","@@",13);
        UserKonstruktor Tadeusz2 = new UserKonstruktor("Tadzio","ZXC","@",23);
        UserKonstruktor ABC = new UserKonstruktor("ABB");

Szymon2.getAllInfo();
Tadeusz2.getAllInfo();

    }
}
