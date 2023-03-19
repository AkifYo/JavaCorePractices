package P05_Math;

import java.util.Scanner;

public class A01_PowerOftheNumber {
    public static void main(String[] args) {
        // 2^0=1
        //2^1=2
        //2^2=4
        //2^3=8
        //2^4=16
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter power value:  ");
        int powerN=scan.nextInt();

        System.out.println("Please enter the limit value: ");
        int limit=scan.nextInt();
        //i=1: i*=n
        for (int i = 1; i <=limit ; i*=powerN) {
            System.out.println(i);
        }
        // you shoul understan the structure of your question
        
    }
}
