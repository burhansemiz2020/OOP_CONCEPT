package OOP_PassByValue;

import java.util.Arrays;

public class C03_PassValueArray {
    public static void main(String[] args) {
        /*
        verilen bir array in elementlerini 5 arrtirip
        sonra yazdiran bir method olusturun
         */
        int[] arr ={3,4,5};
        elementleri5arttir(arr);

        System.out.println("Method call dan sonra main method icinde arr: " + Arrays.toString(arr));

    }
    public static void elementleri5arttir(int[]arr){
        for(int i=0;i<arr.length;i++){
           arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
