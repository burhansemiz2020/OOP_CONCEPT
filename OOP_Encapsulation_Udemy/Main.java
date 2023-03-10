package OOP_Encapsulation_Udemy;

public class Main {
    public static void main(String[] args) {
        /*Abonnement abonnement = new Abonnement();
        abonnement.nom="Burhan Semiz";
        abonnement.credite=250;
        abonnement.ville="Aix en Provence";

        abonnement.consommeGaz(250);*/
        /*
        1. Burda 250 euro mantiksiz bir deger public oldugu icin bu degeri
        degisiklige ugratabilmemiz aslinda bir risk.
        2. constructor i otomatik olarak calistimadigimiz icin hata payi ortaya
        cikiyor.
        3. Yani degistirilen bir ozellik diger tum class larda degistirilmesi
        gerekiyor.
        Bu nedenle private sinif yapmak lazim
         */
        NouvelleAbonnement abonnement=new NouvelleAbonnement("Burhan Semiz",200, "Aix en Provence" );
        abonnement.decouvreCredit();
    }
}
