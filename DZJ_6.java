import java.util.HashSet;
import java.util.Set;

public class DZJ_6 {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1100, 15, "Ivan", "Petrov"); // -> A
        Employee emp2 = new Employee(2200, 25, "Pasha", "Ivanov"); // -> B
        Employee emp3 = new Employee(3300, 30, "Sasha", "Vasiliev"); // -> C
        Employee emp4 = new Employee(4400, 10, "Igor", "Karpov");
        Employee emp5 = new Employee(5500, 90, "Vasya", "Kolosov");

        Set<Employee> hashSet = new HashSet<>();
        hashSet.add(emp1);
        hashSet.add(emp2);
        hashSet.add(emp3);
        hashSet.add(emp4);
        hashSet.add(emp5);

        System.out.println(hashSet);

        System.out.println(emp1.olderThan(emp5));
        System.out.println(emp3.olderThan(emp2));

        System.out.println(emp1.firstName);
        System.out.println(emp3.lastName);
        System.out.println(emp2.id);

        System.out.println(emp1.salary);
        emp1.upgrade(100);
        System.out.println(emp1.salary);

    }
}
