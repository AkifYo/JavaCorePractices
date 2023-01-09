package P04_Course;

import java.util.Scanner;

public class A01_Factoriel {
    public static void main(String[] args) {

        System.out.println("please type a number : ");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        System.out.println(facT(userNumber));

    }

    public static int facT(int n) {
        if (n >= 1)
            return n * facT(n - 1);
        else
            return 1;
    }
}

