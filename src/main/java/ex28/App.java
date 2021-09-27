package ex28;

import java.util.Scanner;



public class App {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int ans = 0;
    for(int i=0; i<5;i++){
        System.out.print("Enter a number: ");
        ans += in.nextInt();
    }
    System.out.println("The total is " + ans + ".");
}


}
