// Superclass Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Worker interface
interface Worker {
    void performDuties();
}

// Subclass Chef extends Person & implements Worker
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is preparing delicious dishes.");
    }
}

// Subclass Waiter extends Person & implements Worker
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving food to customers.");
    }
}

// Main class to test
public class SampleProblem1 {
    public static void main(String[] args) {
        Worker chef = new Chef("Ramesh", 101);
        Worker waiter = new Waiter("Suresh", 201);

        chef.performDuties();
        waiter.performDuties();
    }
}