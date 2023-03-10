package OOP_Varargs_StringBuilder;

public class Varargs1 {
    public static void main(String[] args) {
        sum(5,6);//11
        sum(5,6,7);//18
        sum(5,6,7,8);//26
    /*
    bir method da parametre sayisini sinirlandirmak istemezseniz
    standart bir variable yerine varargs kullaniriz.
    varargs data turunubn yanina ... konularak deklare edilir.
    int... ==> sayisi belirli olmayan int parametreler alan bir arraydir.
     */


    } private static void sum(int ... i) {
        int sumTotal = 0;
        for (int each : i) {
            sumTotal += each;
        }
        System.out.println("Le total des chiffres entrés : " +sumTotal );
    }
}
