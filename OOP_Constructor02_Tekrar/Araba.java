package OOP_Constructor02_Tekrar;

public class Araba {

    public Araba(int yl, String mrk, String mdl, boolean hmi, int fyt) {
        this.yil = yl;
        this.marka = mrk;
        this.model = mdl;
        this.hasarliMi = hmi;
        this.fiyat = fyt;
    }

    public Araba() {

    }

    @Override
    public String toString() {
        return "Araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }
    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;


    public void yakitTuketimi(String yakitTuru) {
        switch (yakitTuru) {
            case "Benzin":
                System.out.println("Benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "Dizel":
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik":
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("Gecersiz yakit turu");


        }

    }
}
