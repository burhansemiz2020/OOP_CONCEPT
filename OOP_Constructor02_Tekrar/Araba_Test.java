package OOP_Constructor02_Tekrar;

public class Araba_Test {
    public static void main(String[] args) {

        Araba araba1 = new Araba();

        araba1.marka="Toyota";
        araba1.model="Corolla";
        araba1.hasarliMi=false;
        araba1.yil=2017;
        araba1.fiyat=5250;

        System.out.println("Marka: "+araba1.marka+ "\nModel: "+araba1.model);
        System.out.println(araba1);

        Araba araba2 = new Araba(2020, "Jazz", "Jazz", false, 15000);
        System.out.println("Araba 2 nin ozellikleri: " +araba2);
        System.out.println("=====================");
        Araba araba3 = new Araba(2023, "Renault", "Beyaz Toroz", false, 1993);

    }
}
