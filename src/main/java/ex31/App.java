package ex31;

import java.util.Scanner;

public class App {
public static void main(String[] args){
    Scanner str = new Scanner(System.in);
    float rate;
    try {
        System.out.println("Enter your age: ");
        int age = str.nextInt();
        System.out.print("Enter your resting heart rate: ");
        float heart = str.nextFloat();
        System.out.println("Resting pulse: " + heart + "   Age:"+age);
        System.out.println("Intensity  |Rate");
        System.out.println("-------------|--------");
        for (int i = 55; i <= 95; i += 5) {
            rate = (((220 - age) - heart) * i/100) + heart;
            System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
        }
    } catch(Exception e) {
        System.out.println("Enter only numbers...");
    }

    }

}



