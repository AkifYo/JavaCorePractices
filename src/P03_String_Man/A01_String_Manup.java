package P03_String_Man;

import java.util.Scanner;

public class A01_String_Manup {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please type en text");
        String userText= scan.nextLine();

        recurringText(userText);
    }

    private static void recurringText(String text) {
        String emptyBox="";
        for (int i = text.length()-1; i >=0 ; i--) {
            emptyBox+=text.substring(i,i+1);
            
        }
        if (text.equalsIgnoreCase(emptyBox)){
            System.out.println("Your test is Palindrome");
        } else {
            System.out.println("Your test IS NOT Palindrome");
        }
    }
}
