package ex40;

import java.util.Date;
import java.util.TreeMap;

public class App {
    static TreeMap<Integer, Employee> employees = new TreeMap<>();


    private String firstName;
    private String lastName;
    private String position;
    private Date separationDate;


    public App(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public App(String firstName, String lastName, String position, Date separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(Date separationDate) {
        this.separationDate = separationDate;
    }


    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lastName=" + lastName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }

//I don't know how to fix this. Why aren't the functions recognized?

     public static int search(String name){
        int count = 0;
        for(int x : employees.keySet()){
            if(employees.get(x).getFirstName().equalsIgnoreCase(name) || employees.get(x).getLastName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(x));
            }
        }
        return count;
    }

    private static class Employee {
    }
}

