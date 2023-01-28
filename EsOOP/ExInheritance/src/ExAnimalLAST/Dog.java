package ExAnimalLAST;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("WOOF WOOF");
    }
    public void greets(Dog doge){
        System.out.println("WOOF WOOF WOOOOOOOOOOOOOOOOOF");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{}";
    }
}
