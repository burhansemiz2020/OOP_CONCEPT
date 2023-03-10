package OOP_Inheritence1_Overriding;

public class Test {
    public static void main(String[] args) {
        /*
        dans l'inheritance il ya de logic " ...IS A...."
        c'est une expression tres courans das Java
        Dans les entretiens cela est pose comme question
         */
        Director director1 =new Director("Burhan Semiz", 5000, "IT Department",10 );
        director1.montreLinfos();
        director1.augmenterSalaire(200);





        /*
        NOT: INHERITENCE IN MANTIGI ASLINDA BURDA ORTAYA CIKIYOR.
        EGER SIZIN BIR ANA CLASS INIZ VARSA VE BU ANA CLASS IN
        ALTINDA ALT SINIFLAR OLACAKSA BUTUN ORTAK OZELLIKLERI VE
        METOTLARI BIR ANA CLASS IN ALTINDA DIREK OLARAK BIRIKTIRIYORUZ
         */
        /*
        OVERRIDING: MIRAS ALDIGIMIZ METOTLARI KENDI CLASSIMIZA DA
        TANIMLARSAK BIZ BU METODU CAGIRDIGIMIZ ZAMAN ARTIK BIZIM
        MIRAS ALDIGIMIZ DEGIL KENDI METODUMUZ CAGIRILACAK. BU
        ORNEKTE TEST DOSYASI ICINDE RESPONSABLE A 10 YAZDIK AMA
        BUNU KONSOLDA YAZDIRAMADIK. CUNKU EMPLOYER DOSYASINDA
        MONTRELINFOS CONS LARI ICERISINDE BU YOKTU. BUNLARA
        ERISMEK ICIN SETTER GETTER YAPIP, BUNLARI YONETICI
        CLASSI ICINDEN DE KULLANABILECEGIZ. ASLINDA BU YONTEMLE
        SUPERCLASS TAKI METODU IPTAL ETMIS OLUYORUZ.
         */
    }
}
