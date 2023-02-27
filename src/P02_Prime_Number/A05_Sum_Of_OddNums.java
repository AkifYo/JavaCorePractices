package P02_Prime_Number;

import java.util.Scanner;

public class A05_Sum_Of_OddNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;
        int sum = 0;
        //solution 0
        do{
            System.out.println("Please enter a userNum: ");
            userNum = input.nextInt();
            sum += userNum;
        }while (userNum > 0);
        System.out.println("Sum of odd userNums is: " + sum);
        //solution 1
       /* while (userNum > 0) {
            if (userNum % 2 == 1) {
                sum += userNum;
            }
            System.out.println("Please enter a userNum: ");
            userNum = input.nextInt();
        }
        System.out.println("Sum of odd userNums: " + sum);
        */
        //solution 2
        /*
        while (true) {
            System.out.println("Please enter a userNum: ");
            userNum= input.nextInt();
            if (userNum<0) {
                break;
            }
            if (userNum%2==1){
                sum+=userNum;
            }
            System.out.println(userNum);
        }
        System.out.println("Sum of odd userNums is: "+sum); */
    }
}
