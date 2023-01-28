public class ElectricCar extends Car{
    private int EHp;

    public ElectricCar(String plate, String model, double prezzo, int ehp) {
        super(plate, model, prezzo);
        this.EHp=ehp;
    }
    public void setEHp(int EHp) {
        this.EHp = EHp;
    }

    @Override
    public int getPower() {
        return EHp/2;
    }

    @Override
    public String toString() {
        return super.toString() + "ElectricCar{" +
                "EHp=" + EHp +
                '}';
    }
}
