package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOf_guess =0;

    Game(){
        Random rand = new Random();
        number = rand.nextInt(100);

    }

    public void takeInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    public boolean isCorrectNumber(){
        numberOf_guess++;
        if(inputNumber > number){
            System.out.println("number is too high");
            return false;
        }else if(inputNumber<number) {
            System.out.println("number is too low");
            return false;
        }else {
            System.out.format("Hooray! you guess the correct number in %d attempts\n",numberOf_guess);

        }
        return true;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeInput();
            b = g.isCorrectNumber();
        }

    }
}
