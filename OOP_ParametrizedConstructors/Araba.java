package OOP_ParametrizedConstructors;

public class Araba {


    public Araba(String marka, String model, String yakit, boolean hasarliMi, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.hasarliMi = hasarliMi;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    String marka="Marka belirtilmemeiz";
    String model="Model belirtilmemis";
    String yakit;
    boolean hasarliMi;
    int yil;
    int fiyat;
    public Araba() {

    }
    public Araba(String mrk, String mdl) {
    marka=mrk;
    model=mdl;

    }


    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }
}
