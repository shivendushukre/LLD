
/**
 * Creational - creating objects which belong to a family of similar objects
 * Pros:
 * 1. Good for abstraction and family of similar objects
 * 2. loose coupling b/w client and actual/concrete code
 * 3. all classes follow Single Responsibility Principle
 * 4. Supports Open Closed Principle
 * Cons:
 * 1. Code becomes complicated/complex
 * 2. Pattern inside a pattern
 * */

public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee(new DeveloperFactory());
        System.out.println(employee.name() + " " + employee.salary());

        Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(manager.name() + " " + manager.salary());
    }
}