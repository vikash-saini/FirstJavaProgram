package com.company;

public class BreakAndContinue {
    public static void main(String[] args) {
        //Break and continue using loops
        for(int i=0; i<=7;i++){
            System.out.println(i);
            if(i == 2){
                System.out.println("breaking the loop");
                break;
//                continue;
            }
        }
    }
}
