package Lab_1;

abstract class Animal {
    public abstract void greeting();

    public abstract void makeSound();
}

class Tiger extends Animal {
    public void greeting() {
        System.out.println("Tiger");
    }

    public void makeSound() {
        System.out.println("tiger sound");
    }

    public void bite() {
        System.out.println("tiger bite");
    }
}

public class Lab_8 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.greeting();
        t.makeSound();
        t.bite();
    }
}
