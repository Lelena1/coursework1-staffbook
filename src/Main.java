import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printSeparator();

        System.out.println("Базовый уровень");

        printSeparator();

        FullName fullName1 = new FullName("Бурлуцкий", "Богдан", "Валентинович");
        FullName fullName2 = new FullName("Журавлева", "Марина", "Анатольевна");
        FullName fullName3 = new FullName("Матюшин", "Алексей", "Валериевич");
        FullName fullName4 = new FullName("Портнова", "Галина", "Александровна");
        FullName fullName5 = new FullName("Расторгуева", "Юлия", "Сергеевна");
        FullName fullName6 = new FullName("Решетникова", "Татьяна", "Петровна");
        FullName fullName7 = new FullName("Рытикова", "Екатерина", "Анатольевна");
        FullName fullName8 = new FullName("Рябич", "Оксана", "Николаевна");
        FullName fullName9 = new FullName("Устинова", "Людмила", "Николаевна");
        FullName fullName10 = new FullName("Яковец", "Мария", "Николаевна");

        System.out.println("Список Ф.И.О. всех сотрудников:\n\n" + fullName1 + "\n" + fullName2 + "\n" + fullName3 + "\n"
                + fullName4 + "\n" + fullName5 + "\n" + fullName6 + "\n" + fullName7 + "\n"
                + fullName8 + "\n" + fullName9 + "\n" + fullName10);

        printSeparator();

        Employee[] employees = new Employee[10];

        employees[0] = new Employee(fullName1, "1", 42000.50);
        employees[1] = new Employee(fullName2, "2", 37300.20);
        employees[2] = new Employee(fullName3, "3", 29500.10);
        employees[3] = new Employee(fullName4, "4", 24620.65);
        employees[4] = new Employee(fullName5, "4", 22800);
        employees[5] = new Employee(fullName6, "5", 32100.10);
        employees[6] = new Employee(fullName7, "3", 34500.70);
        employees[7] = new Employee(fullName8, "2", 43300);
        employees[8] = new Employee(fullName9, "1", 33000);
        employees[9] = new Employee(fullName10, "1", 24500.90);

        System.out.println("Список всех сотрудников со всеми данными:\n");
        System.out.println(Arrays.toString(employees));

        printSeparator();

        calculateSumOfMonthlySalary(employees);

        printSeparator();

        сalculateAverageSalary(employees);

        printSeparator();

        findEmployeeWithMinSalary(employees);

        printSeparator();

        findEmployeeWithMaxSalary(employees);

        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("=========================================================================================");
    }

    public static void calculateSumOfMonthlySalary(Employee[] employees) {
        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет: " + sum + " рублей.");
    }

    public static void сalculateAverageSalary(Employee[] employees) {
        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        double averageSalary = (sum / (employees.length));
        System.out.println("Среднее значение зарплат равно: " + averageSalary + " рублей.");
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        double min = employees[0].getSalary();
        FullName employeeWithMinSalary = employees[0].getFullName();

        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                employeeWithMinSalary = employee.getFullName();
            }
        }
        System.out.println("Сотрудник " + employeeWithMinSalary +
                " имеет минимальную зарплату в размере " + min + " рублей.");
    }

    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        double max = employees[0].getSalary();
        FullName employeeWithMaxSalary = employees[0].getFullName();

        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee.getFullName();
            }
        }
        System.out.println("Сотрудник " + employeeWithMaxSalary +
                " имеет максимальную зарплату в размере " + max + " рублей.");
    }
}