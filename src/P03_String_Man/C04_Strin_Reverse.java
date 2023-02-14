package P03_String_Man;

import java.util.Scanner;

public class C04_Strin_Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a text");
        String userText= scan.nextLine();

        String reversedText="";
        for (int i = userText.length()-1; i >=0 ; i--) {
           reversedText+= String.valueOf(userText.charAt(i));

        }
        System.out.println(reversedText);
    }
}
