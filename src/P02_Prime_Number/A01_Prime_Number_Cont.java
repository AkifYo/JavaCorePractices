package P02_Prime_Number;

import java.util.Scanner;

public class A01_Prime_Number_Cont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to control whether it is a prime number : ");
        int userNum= scan.nextInt();
        numberCheck(userNum);
    }

    private static void numberCheck(int userNum) {
        boolean numChec=true;

        if (userNum>=2) {
            for (int i = 2; i <userNum ; i++) {
                if (userNum%i==0){
                    numChec=false;
                    break;
                }
            }

        } else {
            numChec= false;
        }
        if (numChec){
            System.out.println("The number you have entered is  prime number");
        } else {
            System.out.println("The number you have entered is NOT prime number");
        }
    }
}
