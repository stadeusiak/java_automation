package ZD;

public class zd_2 {
    public static void main(String[] args) {

        zd_2BUG BUG1 = new zd_2BUG("Brak komunikacji","   @@ ", 3,"  QWERT");


        BUG1.getAllInfo();

        int bug1Priorytet = BUG1.getPriorytet();
        System.out.println(bug1Priorytet);

        BUG1.getReporter();

        BUG1.getStats();















    }


}
