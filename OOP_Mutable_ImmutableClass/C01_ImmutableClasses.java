package OOP_Mutable_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java guzeldir";
        System.out.println(str.toUpperCase());//JAVA GUZELDIR
        System.out.println(str);//Java guzeldir
        str.toLowerCase();
        System.out.println(str);//Java guzeldir
        /*
        SOnuc olarak string immutable oldugu icin
        metot ile yapilan degisikler Stringi
        kalici olarak degistirmezler. Ama listler boyle degildir.
         */
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);
        System.out.println(harfler);//[B]
        //List ve Array mutable olduklari icin
        // method ile yapilan degisikler kalici olur
    }
}
