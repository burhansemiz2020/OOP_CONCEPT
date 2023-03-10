package OOP_StringBuilder_StringBuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        3 farkli sekilde String Builder olusturuluyor.
        1. StringBuilder sb1 = new StringBuilder(); 16 karakter
        2. StringBuilder sb2 = new StringBuilder("Ali Can"); Uygun kapasitede bis SB olusturulur
        3. StringBuilder sb3 = new StringBuilder(capacity: 7); 7 kapasitelik bir yer acar.
        Ama siz 7 karakterden fazla bir veri girerseniz ona gore kendi kapasitesini arttirir.

         */
        StringBuilder sb = new StringBuilder(7);
        /*
        Bu kod yazildiginda Java 7 karakter alabilecek
        bir String builder olusturur.
         */
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//0
        sb.append("Java");
        System.out.println(sb);

        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//4

        sb.append(" guzeldir.");

        System.out.println(sb);//Java guzeldir.
        System.out.println(sb.capacity());//7*2+2=16
        System.out.println(sb.length());//14

        sb.append(" ona ne suphe");

        System.out.println(sb);//Java guzeldir. ona ne suphe
        System.out.println(sb.capacity());//16*2+2=34(16 ya sigmayacagi icin 16 ile 2 yi carpip karakteri arttirdik)
        System.out.println(sb.length());//27

        /*
        Kapasite ve lengthi esitlemek istersek trimToSize kullanilir.
         */
        sb.trimToSize();
        System.out.println(sb.capacity());//27
        System.out.println(sb.length());//27



    }
}
