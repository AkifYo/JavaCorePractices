package P02_Prime_Number;

import java.util.Scanner;

public class A02_Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first text");
        String firstTx= scan.nextLine();
        System.out.println("Please enter the second text");
        String secondTx= scan.nextLine();
        boolean result=true;
        if (firstTx.length()==secondTx.length()){
            for (int i = 0; i < firstTx.length(); i++) {
                if (firstTx.toLowerCase().contains(secondTx.toLowerCase().substring(i,i+1))){
                    continue;
                }else{
                    result=false;
                    break;
                }
            }

        }else {
            result=false;
        }
        if (result){
            System.out.println("Your texts are anagram : you should be able to find the anagram");
        }else {
            System.out.println("Your texts are NOT anagram: you should NOT be able to find the anagram");
        }

    }

}
