package tech.changyan.hello.java;

public class HelloPoly {

    public static void main(String[] args){
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();

        ((Cat) cat).miaow();
        ((Dog) dog).bark();
    }

}

class Animal {
    public void eat() {
        System.out.println("Animal eats..");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats..");
    }

    public void miaow() {
        System.out.println("Cat miaows..");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats..");
    }

    public void bark(){
        System.out.println("Dog barks");
    }
}