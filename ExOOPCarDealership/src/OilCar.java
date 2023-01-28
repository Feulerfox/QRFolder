public class OilCar extends Car{

    private int Hp;

    public OilCar(String plate, String model, double prezzo,int hp) {
        super(plate, model, prezzo);
        this.Hp=hp;
    }

    @Override
    public int getPower() {
        return Hp;
    }

    @Override
    public String toString() {
        return super.toString() + "OilCar{" +
                "Hp=" + Hp +
                '}';
    }
}
