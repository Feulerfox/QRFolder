import java.util.Arrays;
import java.util.Random;

public class CarDealer {

    public CarDealer() {
    }

    private String name;
    private Car[] cars;
    private Customer[] customers;

    public void garage(){
        Random random=new Random();
        cars=new Car[random.nextInt(1,10)];
        for (int i = 0; i < cars.length  ; i++) {
            if(i%2==0)
                cars[i]= new ElectricCar(Car.generatePlate(),Car.generateModel(),Car.generatePrice(), random.nextInt(1,101));
            cars[i]= new OilCar(Car.generatePlate(),Car.generateModel(),Car.generatePrice(), random.nextInt(1,101));
        }
    }

     public void showGarage(){
        for (Car c: cars) {
            System.out.println(c);
        }
    }
    public double discount(int percent, Car car) {
        car.setPrice(car.getPrice()*percent/100+ car.getPrice());
        return car.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }
    public Customer[] getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}
