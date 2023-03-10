package OOP_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat = 100;
        System.out.println(indirimUygula1(fiyat));
        System.out.println(indirimUygula2(fiyat));
        System.out.println(indirimUygula3(fiyat));
        System.out.println(fiyat);//100
        fiyat = indirimUygula1(fiyat);
        System.out.println(fiyat);//90 bundan sonra fiyat kalici olarak 90 olur
        /*
        burda sout icerisinde fiyati dogrudan yazdirirsak
        yuzde 10 luk deger dususunu yazdirmaz. Alinda asagidaki
        methodda fiyatin degerini yeniledik fakat ne yaparsak yapalim
        fiyat dogrudan yazdirilinca hep 100 cikiyor. Java iste bu ozellige
        pass by value diyor

        ***Kodlarimizin anlasilir olmasi icin main methoddan
        diger methodlara parametre olarak gonderdigimiz
        variable lar icin ayni isimli variable olusturmayi tercih ederiz.

        ***Java methodlar arasinda gecis yaparken variable i degil
        variable in valuesunu pass eder.
        Bu Java nin Pass by Value yu tercih etmesinden kaynaklanir.

        Eger methodun iccerisinde yapilan degisikligin main method icinde de
        kalici olmasini isterseniz main method icerisinde
        fiyat=incirimUygula(fiyat); atamsini yapariz

         */
    }

    public static double indirimUygula1(double fiyat) {
        return fiyat * 0.9;
    }

    public static double indirimUygula2(double fiyat) {
        return fiyat * 0.8;
    }

    public static double indirimUygula3(double fiyat) {
        return fiyat * 0.7;
    }
}
