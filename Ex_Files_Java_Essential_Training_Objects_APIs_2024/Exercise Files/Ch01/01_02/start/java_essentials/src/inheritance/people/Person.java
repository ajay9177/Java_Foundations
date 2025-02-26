package inheritance.people;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("In Person default constructor");
    }

    public Person(String name){
        System.out.println("In Person 2nd constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

//A superclass's constructor is run before the subclass's constructor
//An explicit call can be made to the superclass's constructor from one of teh subclass's constructors by using super()
//An explicit call to the superclass's constructor must be the first statement in the subclass's constructor
//If the supercalss does not have a default constructor, the subclass must explicitly call one of its constrcutors