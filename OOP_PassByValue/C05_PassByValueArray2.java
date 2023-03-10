package OOP_PassByValue;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {
        /*
        Bir method olusturun
        sayilar arrayin uzunlugundan 2 fazla olan
        ve elementlerin tamami 5 olan yeni bir arra olusturup
        deger olarak sayilar arrayine atayin ve
        sayilar arrayini yazdirin
         */
        /*
        NOT: JAVA HER DURUMDA PASS BY VALUE KULLANIR.
        ELEMENTLERE YENI DEGER ATAMASI YAPINCA LIST
        DEGISMEZ KALICI OLUR. YANI BURADA DEGER ATAMA
        OLMAZSA PASS BY VALUE GECERLI OLUR VE ILK DEGERI
        YAZAR.
         */
        int[]sayilar={3,4,5,6};
        arrayeDegerAta(sayilar);
        System.out.println("Main methodda sayilarin son hali: "+ Arrays.toString(sayilar));



    }
    public static void arrayeDegerAta(int[]sayilar){
        int[]yeniArray=new int[sayilar.length+2];
        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=5;

        }
        sayilar=yeniArray;
        System.out.println("Methodda sayilarin son hali: "+ Arrays.toString(sayilar));

    }
}
