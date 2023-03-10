package OOP_Mutable_ImmutableClass;

public class C02_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java candir";
        str=str.toUpperCase();
        System.out.println(str);
        //Immutable class larda olusturulan bir objenin degeri degistirilemez
        //Eger atama yaparsaniz java degerini degistirmez.
        //Bunun yerine yeni bir obje olusturur ve bu yeni objeye
        //yeni atadiginiz degeri atar. Eski obje bosa cikar ve garbage collector
        //tarafindan silinmeyi bekler.
    }
}
