package OOP_Varargs_StringBuilder;

public class Varargs {
    public static void main(String[] args) {
        sum(5,6, 7, 8);
        sum(5,6,7, 8);
        sum(2,4,6,8);
    }
    /*
    parametre sayisi degistikce bizden yeni method olusturmamizi ister.

     */

    private static void sum(int i, int i1, int i2, int i3) {
        System.out.println("L'addition des deuxnombres est: " +(i + i1 + i2 + i3));

    }
}
