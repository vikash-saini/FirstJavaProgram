package com.company;

import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int totalMarksPerSub = 100;

        System.out.print("Marks in Hindi:");
        int h = sc.nextInt();

        System.out.print("Marks in English:");
        int e = sc.nextInt();

        double totalmarksGained = h+e;
        System.out.println("Total marked gained: "+totalmarksGained);
        double totalpercent= ((h+e)*100)/200 ;

        double percentinhindi =h*100/100;
        double percentinenglish =e*100/100;
        System.out.println("Total percentage: "+totalpercent+"%");
        System.out.println("Percentage in Hindi: "+percentinhindi+"%");
        System.out.println("Percentage in English: "+percentinenglish+"%");

        if (totalpercent >=40){
            if (percentinhindi <33){
                System.out.println("failed in hindi!");
            }
            if (percentinenglish <33){
                System.out.println("failed in english!");
            }else{
                System.out.println("passed");
            }

        }else{
            System.out.println("Failed!");
        }


    }
}
