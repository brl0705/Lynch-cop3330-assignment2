package ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //prompt the user for output
        System.out.println("Let's play Guess the Number!");
        int num;
        num = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            if(key==1)
                num = (int) (Math.random() * 10 + 1);
            else if(key==2)
                num = (int) (Math.random() * 100 + 1);
            else
                num = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = sc.nextInt();
                total++;
                if (guess == num){
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < num)
                    System.out.println("Too low. Guess again: ");
                else if (guess > num)
                    System.out.println("Too high. Guess again: ");

            }while (guess != num);
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }

    }
}