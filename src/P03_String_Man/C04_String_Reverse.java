package P03_String_Man;

import java.util.Scanner;

public class C04_String_Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a text");
        String userText= scan.nextLine();

        String reversedText="";
        for (int i = userText.length()-1; i >=0 ; i--) {
           reversedText+= String.valueOf(userText.charAt(i));

        }
        System.out.println(reversedText);

        System.out.println(reverseLetter("akif yorulmaz"));

    }
    public static String reverseLetter(String s){
        String reversedTextM="";
        int letterIndex=0;
        char [] letters= new char[s.length()];
        for (int i = s.length()-1; i >=0 ; i--) {

            letters[letterIndex]=s.charAt(i);
            letterIndex++;
            

        }
        for (int i = 0; i < s.length(); i++) {
            reversedTextM=reversedTextM+letters[i];
        }

        return reversedTextM;

    }
}
