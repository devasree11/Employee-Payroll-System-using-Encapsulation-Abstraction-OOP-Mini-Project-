abstract class Employee {
    private int empId;
    private String name;
    private double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + calculateSalary());
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee(101, "Deva", 30000, 5000);

        emp.displayDetails();

        emp.setBasicSalary(35000);

        System.out.println("\nAfter Salary Update:");
        emp.displayDetails();
    }
}