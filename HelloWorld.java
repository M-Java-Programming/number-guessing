package org.example;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Hey, Welcome to Guessing Game. \n It Promises to be cool!!!");

        //Greet the user
        System.out.println("What is your name: ");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Welcome "+ username+ " !!");

        System.out.println("Are you ready for the game \n A. Yes \n B. No");
        String answer = input.next();
        if(answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("yes")){
            // generate a random number
            Random rand = new Random();
            int number = rand.nextInt(100)+1;
           // System.out.println(number);
            for (int i=5; i>=0; i--) {
                System.out.println("Guess a number between 0 and 100: ");
                int userGuess = input.nextInt();
                if (userGuess > number){
                    if(i>0){
                    System.out.println("Wrong guess \n The number is smaller than guess \n You have " + i + " trials left");
                    }else{
                        System.out.println("Game Over!!!");
                        System.out.println("The number is "+ number);
                    }
                }else if (userGuess < number){
                    if(i>0){
                    System.out.println("Wrong guess \n The number is larger than guess \n You have " + i + " trials left");
                    }else{
                        System.out.println("Game Over!!!");
                        System.out.println("The number is "+ number);
                    }
                }
                else {
                    i =0;
                    System.out.println("Awesome!!! Correct guess");
                }
            }
        } else if(answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("No")){
            System.out.println("Goodbye "+ username);
        }
        else{
            System.out.println("Dear "+ username + ", you've entered an invalid input!!");
        }



    }
}
