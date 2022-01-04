package TypyDanych;

public class InstrukjceSterujace {
    public static void main(String[] args) {

//        int a = 1;
//        int b=2;
//
//        if(a>b){
//            System.out.println("Jest to prawda ze a mniejsze od b");
//    } else{
//            System.out.println("");

        String homepage = "Home";
        String loginPage = "Login";
        String ContactPage = "Contact";

        String page= homepage;

        switch (page){
            case"Home":
                System.out.println("Wykonuje kod home - Przełączam się do strony Home ");
                break;
            case"Login":
                System.out.println("Wykonuje kod Login - Przelaczam sie do Login");
                break;
            default:
                System.out.println("Nieznam takiej strony");

                //operator modulo do sprawdzania co drugiej wartosci - narzyklad w tabelce

                if(9%2 == 0){
                    System.out.println("Jest libcza parzysta");
                }else{
                    System.out.println("nie jest liczbą parzysta");

                }



        }
}
}
