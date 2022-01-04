package ZD;

public class zd_2BUG {

    //pola obiektu

    String opisBledu;
    String reporterMail;
    int priorytet;    // 1-5
    boolean status;         //otwarty default - open/close
    String reporter;


    //konstruktor


    zd_2BUG(String opisBledu, String reporterMail, int priorytet, String reporter){

        this.opisBledu = opisBledu;
        this.reporterMail = reporterMail;
        this.priorytet = priorytet;
        this.status = true;
        this.reporter = reporter;

    }

    //metody

    void getAllInfo(){
        System.out.println("Opis bledu: "+opisBledu+" Reporter: "+reporterMail+" P:" +priorytet+" status:"+status);

    }

    void getReporter(){
        System.out.println(reporter);
    }

    void getStats(){
        System.out.println(status);
    }
    int getPriorytet(){
        return priorytet;
    }



}
