package OOP_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {
        /*
        Bir method olusturalim method da yeni bir liste olusturun
        listeye sayilar listesindeki degerlerin 5 fazlasini element
        olarak atayin. ve list ini yazdirin.
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        yeniListe5arttir(sayilar);

        System.out.println("main methodda sayilar listesi: " +sayilar);

        /*
        main methoddaki sonuc ile methoddaki sonuc arasindaki deger farkinin
        tek sebebi method altinda sayilar listesinin tamamina yeni bir deger atadik.

         */

    }
    public static void yeniListe5arttir(List<Integer>sayilar){
        List<Integer>yeniListe=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            yeniListe.add(sayilar.get(i)+5);
        }sayilar=yeniListe;
        System.out.println("methodda sayilar listesinin son hali: "+sayilar);
    }
}
