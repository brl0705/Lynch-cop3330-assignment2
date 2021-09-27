package ex34;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
public static void main(String[] args){
    ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
    System.out.println(employees);

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("Enter an employee name to remove: ");
    String delete = sc.nextLine();

    employees.remove(delete);
    System.out.println();
    System.out.println(employees);
}
}



