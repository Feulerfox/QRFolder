import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Car car=new ElectricCar("disabile", "nebr",800.0,25);
    System.out.println(car.getPower());

    CarDealer[] carDealers=new CarDealer[2];
    carDealers[0]=new CarDealer();
    carDealers[1]=new CarDealer();
    carDealers[0].garage();
    carDealers[1].garage();

    carDealers[0].showGarage();
    System.out.println(carDealers[0]);

    
    }
}