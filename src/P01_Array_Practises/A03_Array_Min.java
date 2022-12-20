package P01_Array_Practises;

import java.util.Arrays;
import java.util.Scanner;

public class A03_Array_Min {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int elementsTot= scan.nextInt();
        int [] arrNum= new int[elementsTot];
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("Enter the "+(i+1)+" st element");
            arrNum[i]= scan.nextInt();

        }
        System.out.println("Array=> "+ Arrays.toString(arrNum));
        int max= arrNum[0];
        int min= arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (max < arrNum[i]) {
                max= arrNum[i];
            }
            if (min>arrNum[i]){
                min=arrNum[i];
            }
        }
        System.out.println("The abstraction of the biggest number from the minest number is: "+(max-min));

        }


    }

