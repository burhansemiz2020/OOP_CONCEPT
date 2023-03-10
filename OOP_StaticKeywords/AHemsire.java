package OOP_StaticKeywords;

public class AHemsire {
    @Override
    public String toString() {
        return "AHemsire{" +
                "personelAdi='" + personelAdi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", hastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashakimIsmi='" + bashakimIsmi + '\'' +
                '}';
    }

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";
    static String bashakimIsmi="Dr Mehmet Yilmaz";

    String personelAdi="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";


}
