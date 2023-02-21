package P04_Course;

import java.util.Scanner;

public class A05_Leap_Years {
    public static void main(String[] args) {
        // it should be divisible by 4
        // it should be divisible by 400
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        if ((year % 4 == 0 && year%100!=0) || (year % 400== 0)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
