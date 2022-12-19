package P01_Array_Practises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02_Del_Number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        List<String> numList= new ArrayList<>();
        int count=1;
        while(count==1){
            scan= new Scanner(System.in);
            System.out.println("The number you want to add");
            String num= scan.nextLine();
            numList.add(num);
            System.out.println("To continue press number 1, to exit press 2");
            count= scan.nextInt();
        }
        System.out.println("===First verion of the list="+numList);
        for (int i = 0; i < numList.size(); i++) {
            for (int j = i+1; j < numList.size(); j++) {
                if (numList.get(i).equals(numList.get(j))){
                    numList.remove(i);
                    j--;
                }
            }
        }
        System.out.println("Deleted the numbers thats repeating");
        System.out.println("===Last verion of the list="+numList);

    }
}
