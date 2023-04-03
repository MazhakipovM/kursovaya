public class Employee {

    private String name;
    private int dept;
    private int salary;
    private long id;
    private static long nextId;


    public Employee(String name, int dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.id = nextId;
        nextId = nextId + 1;
    }

    public String getName() {
        return this.name;
    }

    public int getDept() {
        return this.dept;
    }

    public int getSalary() {
        return this.salary;
    }


    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "name = " + name +
                ", dept = " + dept +
                ", salary = " + salary +
                ", id = " + id;
    }
}




















































