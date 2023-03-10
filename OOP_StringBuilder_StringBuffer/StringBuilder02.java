package OOP_StringBuilder_StringBuffer;

public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java candir.");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());//.ridnac avaJ
        sb.reverse();

        sb.replace(0,4, "Ahmet Hoca");//Ahmet Hoca candir.
        System.out.println(sb);//Yaaaaaa candir.

        sb.insert(18, " Bu bir yalandir");//Ahmet Hoca candir. Bu bir yalandir
        System.out.println(sb);

        String str="Java cok kotu";
        sb.insert(21, str, 8,13);
        System.out.println(sb);


    }
}
