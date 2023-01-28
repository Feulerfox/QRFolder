package ExAnimal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WOOF");
    }

    public void greets(Dog doggo) {
        System.out.println("WOOF2");
    }


}
