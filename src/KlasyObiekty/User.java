package KlasyObiekty;

public class User {


 // Pola obiektu opisuja z czego bedzie się składał dany obiekt

 String firstNAme;  //domyslnie null
 String lastName; //null
 String email;
 int age;  //domyslnie zero - 0
 boolean isAdult;

 //KONSTRUKTOR - to jest to co przypisujemy do nowego obiektu new User();
 //domyślnie konstruktor klasy jest pusty i wygląda tak:

 User(){

 }
// Kontruktory można tez przeciążać jak metody czyli zostaje ta sama nazwa plus różnica w zmiennych

 User(String firstNAme,String nazwisko, String mail, int wiek, boolean doroslosc){
  System.out.println(firstNAme+nazwisko+mail+wiek+doroslosc);

     this.firstNAme = firstNAme;            // this. wskazuje na pole obiektu dzieki czemu mozemy nazywac parametr tak samo
     lastName = nazwisko;
     email = mail;
     age = wiek;
     isAdult = doroslosc;
 }

 // Metody - okreslają co obiekt może zrobić   - void nie zwraca zadnej metody tylko wyswietla na konsoli

 void getFullName() {
  System.out.println(firstNAme + " " + lastName);
 }

 void getAllInfo() {
  System.out.println(firstNAme + " " + lastName + " " + email + " " + age + " " + isAdult);

 }


// Metoda zwracająca - najpierw typ, nazwa {return}

 int getUserage() {
  return age;
 }

 boolean isuserAdult() {
  if (age > 18) {
   return true;
  } else {
   return false;
  }


 }

 //metoda z parametrem

 void greetins(String name) {
  System.out.println("Hi " + name + " Eloo");
 }

 //metoda z parametrami

 void howOldAreYou(String name, int userAge) {
  System.out.println(name + userAge + "  Jesteś stary");
 }

 int yourAgePlus10(int userAge) {
 return userAge+10;}

 //metody przeciążeniowe - o tej samej nazwie ale o roznych zmiennych

 void greetings(String name, String lastName){
  System.out.println(name+lastName+"jakis teskt");
 }
 int greetings(int age, String name, String addrres){
  System.out.println(age+name+addrres);
  return age+10;
 }

 int greetins(String address, String gender, int age) {
  System.out.println(address+gender+age);
  return age;
 }
}





