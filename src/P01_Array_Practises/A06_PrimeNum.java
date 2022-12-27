package P01_Array_Practises;

import java.util.Scanner;

public class A06_PrimeNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int userNum= scan.nextInt();
        boolean check= true;
        for (int i = userNum; i >1 ; i--) {
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.print(i+" ");
            }
            check=true;

        }
    }
}
