package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog(); //Sasha is of type Animal but of instance Dog
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
    }
}


//Type vs. Instance - An object can have a superclass type and a sibclass instance
//Overriden methods - If a method is overriden by the subclass, the polymorphic object will execute the overridden method at runtime