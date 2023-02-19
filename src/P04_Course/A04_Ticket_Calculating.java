package P04_Course;

import java.util.Scanner;

public class A04_Ticket_Calculating {
    public static void main(String[] args) {
        int km=0;
        int age=0;
        int travelType=1;

        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the long of the way :");
        km=scan.nextInt();
        System.out.println("Enter the age :");
        age=scan.nextInt();
        System.out.println("Enter the type of travel :");
        travelType=scan.nextInt();
        // it can be shorter
        if (km<0){
            System.out.println("Invalid input");
        } else if (age < 0) {
            System.out.println("Invalid input");
        } else if (travelType!=1 && travelType!=2) {
            System.out.println("Invalid input");
        } else {
            double ticketPrice=km*0.10;
            double ageDiscountPrice =0;
            double ageDiscountRate=0;
            double travelDiscount=0;
            if (age<12){
                ageDiscountRate=0.50;
            } else if (age>=12 && age<24){
                ageDiscountRate=0.10;
            } else if (age>65) {
                ageDiscountRate=0.30;
            }
            ageDiscountPrice=ticketPrice*ageDiscountRate;
            double ticketDiscountPrice=ticketPrice-ageDiscountPrice;
            if (travelType==1){
                travelDiscount=ticketDiscountPrice*0.10;
            } else if (travelType==2){
                travelDiscount=ticketDiscountPrice*0.20;
                travelDiscount*=2;
            }
            System.out.println("The ticket price is :"+ticketPrice);
        }

    }

}
