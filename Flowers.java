package Module5_3;

public class Flowers {

    protected double price = 0;

    //public Flowers(Roza(), Cham(), Tulip())

    public String show(){
        return this.getClass().getSimpleName();
    }

    public double getPrice() {
        return price;
    }
}
