package org.allinone.oops.abstracts;

public class AbstractConstructorDemo {
    // Can an abstract class have a constructor in java?

    // Yes, an abstract class can have a constructor in java.
    // An abstract class can have a constructor in java. But, we cannot create an instance of an abstract class using the new keyword.
    // The constructor of an abstract class is called when a subclass object is created. The constructor of an abstract class is called when a subclass object is created.
    // In the below example, we have an abstract class Animal with a constructor. We have a subclass Dog that extends the Animal class. When we create an object of the Dog class, the constructor of the Animal class is called.

    abstract class Animal {
        public Animal() {
            System.out.println("Animal constructor");
        }
    }

    class Dog extends Animal {
        public Dog() {
            System.out.println("Dog constructor");
        }
    }

    public static void main(String[] args) {
        AbstractConstructorDemo abstractConstructorDemo = new AbstractConstructorDemo();
        Dog dog = abstractConstructorDemo.new Dog();

    }

    // Output
    // Animal constructor
    // Dog constructor

    // In the above example, we have an abstract class Animal with a constructor. We have a subclass Dog that extends the Animal class. When we create an object of the Dog class, the constructor of the Animal class is called.
    // The constructor of the Animal class is called when a subclass object is created.
    // The constructor of an abstract class is called when a subclass object is created.


}
