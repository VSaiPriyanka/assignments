import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;

    // Constructor, getters, and setters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class iteratorsandcomparators {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 50000));

        // Sort employees by salary first, then by name if salary is the same
        employees.sort(
            Comparator.comparingDouble(Employee::getSalary)
                      .thenComparing(Employee::getName)
        );

        // Print sorted employees
        employees.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));
    }
}