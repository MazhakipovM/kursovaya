import java.util.Random;

public class Main {
    static  Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван",1,25000);
        employees[1] = new Employee("Ivanov Ivan",5,25000);
        employees[2] = new Employee("Магомедов Магомед",4,25000);
        employees[3] = new Employee("Фураев Леонид",5,25000);
        employees[4] = new Employee("Турукина Александра",3,25000);
        employees[5] = new Employee("Соболев Василий",1,20000);
        employees[6] = new Employee("Грозная Мария",2,25000);
        employees[7] = new Employee("Алексеев Николай",3,25000);
        employees[8] = new Employee("Малышева Юлия",4,25000);
        employees[9] = new Employee("Лобанов Семен",1,30000);


        printAll();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты - " + salarySum());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой - " + finMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой - " + findMaxSalary());
        System.out.println();
        System.out.println("Среднее значение - "+ getAverage());
        System.out.println();
        fullName();

        System.out.println("Задача 6");
        int number = 8;
        System.out.println(number + "- в квадрате, будет равен = "+ sqrt(number));


    }

    public static void printAll() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee =employees[i];
            System.out.println(employee);
        }
    }


    public static double salarySum() {
        double salary = 0.0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            salary= salary + employee.getSalary();
        };return salary;
    }


    public static Employee finMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (min == null  || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        } return min;
    }


    public static Employee findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null  || employee.getSalary() > max.getSalary()) {
            max=employee;
            }
        } return max;
    }


    public static double getAverage() {
        return salarySum()/ employees.length;
    }

    public static void fullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


    ///zadacha 6

    public static int sqrt(int sqrt) {
        return sqrt*sqrt;
    }



}