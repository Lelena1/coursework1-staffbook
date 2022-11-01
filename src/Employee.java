public class Employee {
    private final FullName fullName;
    private String department;
    private double salary;
    public static int counter;
    private int id;

    public Employee(FullName fullName, String department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ". " + "Ф.И.О.: " + fullName + ", " + "отдел № " + department + ", " + "зарплата: " + salary + " рублей.\n";
    }
}
