package P01_Array_Practises;

import java.util.Arrays;

public class A04_Create_Fibonacci {
    public static void main(String[] args) {
        createFib(10);

    }
    public static void createFib(int lengt){
     int [] arrFib  = new int[lengt];  //5
        arrFib[0]=0;
        arrFib[1]=1;

        for (int i = 2; i < lengt; i++) {
            arrFib[i]=arrFib[i-2]+arrFib[i-1];

        }
        System.out.println(Arrays.toString(arrFib));


    }
}
