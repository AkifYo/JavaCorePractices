package P02_Prime_Number;

import java.util.Scanner;

public class A05_Sum_Of_OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Please enter a number: ");
        number = input.nextInt();

        //solution 0
//        do{
//            System.out.println("Please enter a number: ");
//            number = input.nextInt();
//            sum += number;
//        }while (number > 0);
//        System.out.println("Sum of odd numbers is: " + sum);
        //solution 1
        while (number > 0) {
            if (number % 2 == 1) {
                sum += number;
            }
            System.out.println("Please enter a number: ");
            number = input.nextInt();
        }
        System.out.println("Sum of odd numbers: " + sum);

        //solution 2
        /*
        while (true) {
            System.out.println("Please enter a number: ");
            number= input.nextInt();
            if (number<0) {
                break;
            }
            if (number%2==1){
                sum+=number;
            }
            System.out.println(number);
        }
        System.out.println("Sum of odd numbers is: "+sum); */
    }
}
