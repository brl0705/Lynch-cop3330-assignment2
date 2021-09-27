package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {
public static void main(String[] args){
    String[] responses = {"Yes","No","Maybe","Ask again later"};
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    System.out.println("What's your question?");
    String input = sc.nextLine();

    int randomResponse = random.nextInt(responses.length);
    String response = responses[randomResponse];

    System.out.println();
    System.out.println(response);
}

}



