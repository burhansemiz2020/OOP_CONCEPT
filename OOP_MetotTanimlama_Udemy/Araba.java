package OOP_MetotTanimlama_Udemy;

public class Araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public String getModel() {
        return this.model;

    }

    public void setModel(String model) {
        this.model = model;
        //burada this anahtar keliemsiyle bu arabanin modeline direk erisebiliriz.
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        if (kapilar < 0) {
            System.out.println("Kapilar 0'dan kucuk olamaz");
        } else {
            this.kapilar = kapilar;
        }

        return kapilar;
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
