class Animal {
    public void displayInfo() {
        System.out.println("Display Animals.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("Display Dog.");
    }
}

public class Main extends Dog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayInfo();
    }
}