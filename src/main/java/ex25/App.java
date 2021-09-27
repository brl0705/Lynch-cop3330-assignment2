package ex25;

import java.util.Scanner;
import java.io.*;
import java.util.*;

import static ex25.ch.passStrength;

class ch{
    public static void passStrength(String input){
        int x = input.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!','@','#','$','%','^','&','*','(',')','-','+'));
        for(char i : input.toCharArray())
        {
            if(Character.isLowerCase(i)){
                hasLower = true;
            }
            if(Character.isUpperCase(i)){
                hasUpper = true;
            }
            if(Character.isDigit(i)){
                hasDigit = true;
            }
            if(set.contains(i)){
                specialChar = true;
            }

        }
    if (hasDigit && hasLower || hasUpper && specialChar && (x >= 8)){
        System.out.println("Very Strong");
    }
    else if ((hasLower || hasUpper || specialChar && (x >= 8))){
        System.out.println("Strong");
        }
    else if(hasLower || hasUpper && (x < 8)){
        System.out.print("Weak");
        }
    else
        System.out.print("Very Weak");
    }

}

public class App {

public static void main(String[] args)
{
    String input;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Password: ");
    input=sc.nextLine();
    passStrength(input);
}


}
