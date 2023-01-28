package ExAnimal;

public class Main {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("narciso");
        cat1.greets();
        Dog dog1 = new Dog("doggo");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigdoggo");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("ginger");
        animal1.greets();
        Animal animal2 = new Dog("doggo");
        animal2.greets();
        Animal animal3 = new BigDog("bigdoggo");
        animal3.greets();

        // Downcast
        Dog dog2 = (Dog)animal2;
        System.out.println("1####################################################");
        BigDog bigDog2 = (BigDog)animal3;
        System.out.println("2####################################################");
        Dog dog3 = (Dog)animal3; //casto cane all'oggetto di tipo bigDog
        dog3.greets();
        System.out.println("3####################################################");
        //Cat cat2 = (Cat)animal2; non posso castare gatto ad un oggetto di tipo cane
        System.out.println("4####################################################");
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);

    }
}
