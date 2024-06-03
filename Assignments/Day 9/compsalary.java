package assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compsalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anu", 71000));
        employees.add(new Employee("Jaya", 45000));
        employees.add(new Employee("Raji", 69000));
        employees.add(new Employee("Prem", 83000));
        employees.add(new Employee("Sabari", 39000));

        Collections.sort(employees, new EmployeeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name  + ", salary=" + salary +'}';
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {

        int salaryComparison = Double.compare(emp1.getSalary(), emp2.getSalary());
        
        if (salaryComparison == 0) {
            return emp1.getName().compareTo(emp2.getName());
        }
        
        return salaryComparison;
    }
}

