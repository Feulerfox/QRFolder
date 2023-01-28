package ExAnimalLAST;

public class Animal {

    private String name;

    public Animal() {
        name="bomber";
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
