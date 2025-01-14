package week4;

class Person {
    protected String address;

    public Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private String department;

    public Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    public void info() {
        System.out.println("Employee's address is: " + address);
        System.out.println("Employee's department is: " + department);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Employee e = new Employee("Chetrapati, Kathmandu", "Miss");
        e.info();
    }
}

