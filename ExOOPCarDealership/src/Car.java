import java.util.Random;

abstract public class Car{

    private String plate;
    private String model;
    private double price;
    private Customer customer;

    private int hp;

    public Car(String plate, String model, double prezzo) {
        this.plate = plate;
        this.model = model;
        this.price = prezzo;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }

    abstract public int getPower();

    static public String generatePlate(){
        String[] targhe = {"d1s4b1l3","G4y","Lm40","r1t4rd4t0","r1cch10n3"};
        return targhe[(new Random()).nextInt(1,5)];
    }
    static public String generateModel(){
        String[] models = {"yamaherda","toyotard","ford","subaru","vercedes"};
        return models[(new Random()).nextInt(1,5)];
    }
    static public double generatePrice(){
        double[] prices = {800,400,500,1000,2000};
        return prices[(new Random()).nextInt(1,5)];
    }

}
