package P04_Course;

import java.util.Scanner;

public class A06_Astrologic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth of day to see your future  :");
        int dayOfBirth = scanner.nextInt();
        System.out.println("Please enter your birth of month :");
        int monthOfBirth = scanner.nextInt();

        /*
        Aries: Koç        Leo: Aslan        Sagittarius: Yay        Taurus: Boğa
        Virgo: Başak        Capricorn: Oğlak        Gemini: İkizler        Libra: Terazi
        Aquarius: Kova        Cancer: Yengeç        Scorpio: Akrep        Pisces: Balık
         */
        //can be different
        if ((monthOfBirth>0 && monthOfBirth<12) && (dayOfBirth>0 && dayOfBirth<31)) {
           if (monthOfBirth==1){
               if (dayOfBirth<=21){
                    System.out.println("Capricorn");
               }else {
                   System.out.println("Aquarius");
               }
           }
           if (monthOfBirth==2){
               if (dayOfBirth<20){
                   System.out.println("Aquarius");
               }else {
                   System.out.println("Pisica");
               }
           }
           if (monthOfBirth==3){
               if (dayOfBirth<=20){
                   System.out.println("Pisica");
               }else {
                   System.out.println("Aries");
               }
           }
           if (monthOfBirth==4){
               if (dayOfBirth<=21){
                   System.out.println("Aries");
               }else {
                   System.out.println("Taurus");
               }
           }
           if (monthOfBirth==5){
               if (dayOfBirth<=21){
                   System.out.println("Taurus");
               }else {
                   System.out.println("Gemini");
               }
           }
           if (monthOfBirth==6){
               if (dayOfBirth<=21){
                   System.out.println("Gemini");
               }else {
                   System.out.println("Cancer");
               }
           }
           if (monthOfBirth==7){
               if (dayOfBirth<=21){
                   System.out.println("Cancer");
               }else {
                   System.out.println("Leo");
               }
           }
           if (monthOfBirth==8){
               if (dayOfBirth<=21){
                   System.out.println("Leo");
               }else {
                   System.out.println("Virgo");
               }
           }
           if (monthOfBirth==9){
               if (dayOfBirth<=21){
                   System.out.println("Virgo");
               }else {
                   System.out.println("Libra");
               }
           }
           if (monthOfBirth==10){
               if (dayOfBirth<=21){
                   System.out.println("Libra");
               }else {
                   System.out.println(" Scorpio");
               }
           }
           if (monthOfBirth==11){
               if (dayOfBirth<=21){
                   System.out.println("Scorpio");
               }else {
                   System.out.println("Sagittarius");
               }
           }
           if (monthOfBirth==12){
               if (dayOfBirth<=21){
                   System.out.println("Sagittarius");
               }else {
                   System.out.println("Capricorn");
               }
           }
        }else {
            System.out.println("Invalid month and day");
        }

    }
}
