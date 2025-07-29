package Test;

import Interview.Employee;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("suresh",23,70000));
        employees.add(new Employee("kuresh",22,30000));
        employees.add(new Employee("yuresh",24,50000));

        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(employees,salaryComparator);
        employees.forEach(e -> System.out.println(e));
    }


}

class SalaryComparator implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2) {
        if (o1.salary > o2.salary) {
            return 1;
        } else if (o1.salary < o2.salary) {
            return -1;
        } else {
            return 0;
        }
    }
}