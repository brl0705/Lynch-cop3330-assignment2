package ex39;


import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

 class ch {


    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;


    public ch(String firstName, String lastName, String position, String separationDate) {
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

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }
}


class LastNameSort implements Comparator<ch> {
    @Override
    public int compare(ch o1, ch o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}


public class App {
    public static void main(String[] args) {

        List<ch> employeeList = new ArrayList<>();
        employeeList.add(new ch("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new ch("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new ch("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new ch("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new ch("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new ch("Sally", "Webber", "Web Developer", "2015-12-18"));

        Collections.sort(employeeList, new LastNameSort());

        System.out.println("Name" + "                 |  " + "Position            |");
        System.out.println("---------------------|----------------------|");

        for (ch emp : employeeList) {
            System.out.format("%2s %7s    | %4s", emp.getFirstName(), emp.getLastName(), emp.getPosition());
            System.out.println();
        }

    }

}





