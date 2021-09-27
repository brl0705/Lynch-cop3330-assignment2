package ex36;

import java.util.*;
import java.lang.*;

class stats {
    private static ArrayList<Integer>array;
    stats(){
        array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String x;
        int num = 0;
        while(true){
            System.out.print("Enter a number: ");
            x = sc.nextLine();
            if(x.equals("done"))
            {
                break;
            }
            else {
                num = 1;
                for(int i = 0; i<x.length(); i++){
                    if(Character.isDigit(x.charAt(i))){
                        continue;
                    }
                    else {
                        num = 0;
                    }
                }
                if(num==1){
                    array.add(Integer.parseInt(x));
                }
            }
        }
    }
    public static void print(){
        System.out.print("Numbers: ");
        for(int i=0;i<array.size();i++){
            if(i!=array.size()-1){
                System.out.print(+array.get(i)+",");
            }
            else{
                System.out.print(array.get(i));
            }
        }
    }
    public static double average()
    {
        double avg=0;
        for(int i = 0; i<array.size();i++){
            avg = avg+array.get(i);
        }
        avg = avg/array.size();
        return avg;

    }
public static int max(){
        if(array.size()==0){
            return 0;
        }
    int m=array.get(0);
    for(int i=1;i<array.size();i++){
        if(m<array.get(i)){
            m=array.get(i);
        }
    }
    return m;
}
    public static int min()
    {
        if(array.size()==0)
        {
            return 0;
        }
        int m=array.get(0);
        for(int i=1;i<array.size();i++)
        {
            if(m>array.get(i))
            {
                m=array.get(i);
            }
        }
        return m;
    }
    public static double SD()
    {
        double sum = 0;
        double sd = 0.0;
        double mean = 0;
        int n = array.size();

        for (int i = 0; i < n; i++)
        {
            sum = sum + array.get(i);
        }

        mean = sum / (n);

        for (int i = 0; i < n; i++)
        {
            sd = sd + Math.pow((array.get(i) - mean), 2);
        }
        return Math.sqrt(sd / n);
    }
}



public class App {
public static void main(String[] args){
    stats x = new stats();
    x.print();
    assert x.average()==400.0;
    System.out.println("The average is "+x.average());

    assert x.min() == 100;
    System.out.println("The minimum is "+x.min());

    assert x.max() == 1000;
    System.out.println("The maximum is "+x.max());

    System.out.printf("The standard deviation is %.2f",x.SD());
}
}