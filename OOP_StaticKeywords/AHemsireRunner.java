package OOP_StaticKeywords;

public class AHemsireRunner {
    public static void main(String[] args) {//1
        AHemsire h1=new AHemsire();
        h1.personelAdi="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="0668793754";
        System.out.println(h1);
        AHemsire h2=new AHemsire();
        h1.personelAdi="hatice";
        h1.personelAdresi="Sincan";
        h1.personelTelefon="0768793754";
        h2.bashakimIsmi="Yasar Kemal";

        System.out.println("h1 : " +h1);
        System.out.println("h2 : " +h2);
    }
}
