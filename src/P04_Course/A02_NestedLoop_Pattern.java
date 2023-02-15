package P04_Course;

import java.util.Scanner;

public class A02_NestedLoop_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to draw a patern");
        int userNum = scan.nextInt();
        for (int i = 1; i <= userNum; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        for (int i = 4; i > 0; i--) {

                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");

            }
        }
    }
}
