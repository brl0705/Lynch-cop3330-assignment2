package ex35;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
public static void main(String[] args){
    String str;
    ArrayList<String> names = new ArrayList<String>();
    Random x = new Random();
    Scanner y = new Scanner(System.in);
    do {
        System.out.print("Enter a name: ");
        str = y.nextLine();
        names.add(str);
    }
    while(!str.isEmpty());
    names.remove(names.size()-1);
    System.out.println("The winner is " + names.get(x.nextInt(names.size())));
}

}



