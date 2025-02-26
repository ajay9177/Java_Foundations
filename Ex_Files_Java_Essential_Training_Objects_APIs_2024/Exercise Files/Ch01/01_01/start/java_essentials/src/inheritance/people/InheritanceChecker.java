package inheritance.people;

// Class to test inheritance
public class InheritanceChecker {
    public static void main(String[] args) {

        // Creating a Person object
        Person person = new Person(); // Calls the constructor of Person
        person.setName("Alice"); // Setting values using setters
        person.setAge(30);
        person.setGender("Female");

        // Creating an Employee object (inherits from Person)
        Employee employee = new Employee(); // Calls the constructor of Employee
        employee.setName("Bob"); // Inherited method from Person
        employee.setAge(25); // Inherited method from Person
        employee.setGender("Male"); // Inherited method from Person
        employee.setEmployeeId("EMP123"); // Unique to Employee class
        employee.setTitle("Software Engineer"); // Unique to Employee class

        // Printing Person details
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Printing Employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName()); // Inherited from Person
        System.out.println("Age: " + employee.getAge()); // Inherited from Person
        System.out.println("Gender: " + employee.getGender()); // Inherited from Person
        System.out.println("Employee ID: " + employee.getEmployeeId()); // From Employee class
        System.out.println("Title: " + employee.getTitle()); // From Employee class
    }
}


