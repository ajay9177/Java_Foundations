package inheritance.people;

// Subclass Employee that inherits from Person
public class Employee extends Person {

    private String employeeId; // Instance variable (stores employee ID, unique to Employee class)
    private String title; // Instance variable (stores employee title, unique to Employee class)

    // Constructor (initializes a new Employee object)
//    public Employee() {
//        super(); // Calls the constructor of Person class
//        this.employeeId = "Unknown"; // Default value
//        this.title = "Unknown"; // Default value
//    }

    // Getter method to access employee ID
    public String getEmployeeId() {
        return employeeId; // Returns the instance variable "employeeId"
    }

    // Setter method to set employee ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId; // Assigns local "employeeId" to instance variable "employeeId"
    }

    // Getter method to access title
    public String getTitle() {
        return title; // Returns the instance variable "title"
    }

    // Setter method to set title
    public void setTitle(String title) {
        this.title = title; // Assigns local "title" to instance variable "title"
    }
}
