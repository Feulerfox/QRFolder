package ExAnimalLAST;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("MEOW JONESY");
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{}";
    }
}
