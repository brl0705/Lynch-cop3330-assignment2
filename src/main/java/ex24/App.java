package ex24;
import java.util.*;

import static ex24.ch.anagram;

class ch {
    static boolean anagram(String str1, String str2){
        String s1 = str1.replaceAll("\\s","");
        String s2 = str2.replaceAll("\\s","");
        boolean status = true;
        if(s1.length() != s2.length()){
            status = false;
        }
        else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1, arr2);
        }
        if(status){
            return true;
        }
        else {
            return false;
        }

    }
}

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        if (anagram(str1, str2)){
            System.out.println(str1 + " and " +str2 + " are anagrams.");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }



}
