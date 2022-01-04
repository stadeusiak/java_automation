package KlasyObiekty;

public class UserKonstruktor {
    String firstNAme;  //domyslnie null
    String lastName; //null
    String email;
    int age;  //domyslnie zero - 0
    boolean isAdult;

    UserKonstruktor(String firstNAme,String lastName, String email, int age){

        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isuserAdult();     //można dodawać metode do tego
    }
    UserKonstruktor(String pierwszepole){

    }


    void getAllInfo() {
        System.out.println(firstNAme + " " + lastName + " " + email + " " + age + " " + isAdult);

    }

    boolean isuserAdult() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }


    }
}
