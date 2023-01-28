import java.util.Arrays;

public class Customer{

    private String name;
    private Car[] cars;

    public Customer(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCars(int i) {
         return cars[i];
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }



     public void garage(){

        for (Car c: cars) {
            System.out.println(c);
        }

    }
}
