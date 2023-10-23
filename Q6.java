
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Duck implements Swimmer, Flyer {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    public void chirp() {
        System.out.println(name + " is chirping.");
    }
}

class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void mimic() {
        System.out.println(name + " is mimicking.");
    }
}

public class Q6 {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.bark();

        Duck myDuck = new Duck("Daffy");
        myDuck.swim();
        myDuck.fly();

        Parrot myParrot = new Parrot("Polly");
        myParrot.chirp();
        myParrot.mimic();
    }
}
