package ExAnimal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WOOW");;
    }

    @Override
    public void greets(Dog doggo) {
        super.greets(doggo);
    }

    public void greets(BigDog bigdoggo){
        System.out.println("LBAUUU");
    }
}
