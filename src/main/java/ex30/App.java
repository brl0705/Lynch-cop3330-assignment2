package ex30;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
        int rows = 12, cols = 12;
        System.out.print("\t");
        System.out.print("|\t");
        for(int i = 1;i<=cols;i++){
            System.out.print(i + "\t");
        }
        System.out.println("\n---------------------------------");
        for(int i = 1;i<=rows;i++){
            System.out.print(i + "\t");
            System.out.print("|\t");
            for(int j = 1;j<=cols;j++){
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }



}