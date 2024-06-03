/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.animalworld;

/**
 *
 * @author thinkpad
 */
public class AnimalWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       // Animal class
public class Animal {
    private String name;
    private int age;
    
    // Constructors
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Properties
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Methods
    public void makeSound() {
        System.out.println("This animal makes a sound!");
    }
    
    public void eat(String foodType) {
        System.out.println("This animal eats " + foodType + "!");
    }
}

// Lion subclass
public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    
    // Overridden methods
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
    
    
    
    public void eat() {
        System.out.println("Eating meat");
    }
}

// Elephant subclass
public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }
    
    // Overridden methods
    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }
    
    public void eat() {
        System.out.println("Eating grass");
    }
}

// Monkey subclass
public class Monkey extends Animal {
 
        /**
         *
         * @param name
         * @param age
         */
        public Monkey(String name, int age) { 
        
     
    }
    }
