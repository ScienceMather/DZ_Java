import java.util.Objects;

public class Employee {

    static int employeeCounter = 0;

    int age;
    String firstName;
    String lastName;
    double salary;
    Integer id;

    public Employee(Integer id, int age, String firstName, String lastName) {
        this(id, age, firstName, lastName, 50.0);
    }

    public Employee(Integer id, int age, String firstName, String lastName, double salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        employeeCounter++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return id.equals(employee.id) && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName + " ";
    }

    public boolean olderThan(Employee employee) {
        if (age > employee.age) {
            return true;
        }
        return false;
    }

    public void upgrade(double sal) {
        salary += sal;
    }

    @Override
    public String toString() {
        return "Employee[" + "ID = " + id + ", " + getFullName() + age + " years old" + "]";
    }

}
