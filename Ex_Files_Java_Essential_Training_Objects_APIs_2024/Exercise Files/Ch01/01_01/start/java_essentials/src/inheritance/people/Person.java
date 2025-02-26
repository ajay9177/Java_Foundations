// Package declaration
package inheritance.people;

// Class definition for Person
public class Person {

    private String name;  // Instance variable (stores object's name, unique to each instance)
    private int age;      // Instance variable (stores object's age, unique to each instance)
    private String gender; // Instance variable (stores object's gender, unique to each instance)

    // Constructor (initializes a new Person object)
//    public Person() {
//        this.name = "Unknown"; // Default value
//        this.age = 0; // Default value
//        this.gender = "Unknown"; // Default value
//    }

    // Getter method to access the name
    public String getName() {
        return name; // Returns the instance variable "name"
    }

    // Setter method to set the name
    public void setName(String name) { // "name" is a local variable (method parameter)
        this.name = name; // Assigns local "name" to instance variable "name"
    }

    // Getter method to access the age
    public int getAge() {
        return age; // Returns the instance variable "age"
    }

    // Setter method to set the age
    public void setAge(int age) {
        this.age = age; // Assigns local "age" to instance variable "age"
    }

    // Getter method to access gender
    public String getGender() {
        return gender; // Returns the instance variable "gender"
    }

    // Setter method to set gender
    public void setGender(String gender) {
        this.gender = gender; // Assigns local "gender" to instance variable "gender"
    }
}