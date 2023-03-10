package OOP_ParametrizedConstructors;

public class ArabaRunner {
        public static void main(String[] args) {

            Araba arb1 = new Araba();
            arb1.marka="Citroen";
            arb1.model="C3";
            arb1.yakit="Benzin";
            arb1.fiyat=20000;

            System.out.println(arb1);
            Araba arb2=new Araba("Volvo", "CX60");
            System.out.println(arb2);

            Araba arb3=new Araba("Hyundai","i10", 10000);
            System.out.println(arb3);


            Araba arb4=new Araba("Mercedes", "B200", "Dizel", false, 2008, 50000);
            System.out.println(arb4);

            /*
            consolda output larin yan yana gelmesinin sebebi araba dosyasinda toStringi otomatik yaparken
            otomatik sistemin bunu virgul ve ters slash ile yan yana dizmesinden kaynaklanir.

             */

        }
}
