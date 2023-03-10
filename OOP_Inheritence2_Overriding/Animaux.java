package OOP_Inheritence2_Overriding;

public class Animaux {
    private String nom;
    private int kg;
    private int length;
    private int nombreJambe;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNombreJambe() {
        return nombreJambe;
    }

    public void setNombreJambe(int nombreJambe) {
        this.nombreJambe = nombreJambe;
    }

    public Animaux(String nom, int kg, int length, int nombreJambe) {
        this.nom = nom;
        this.kg = kg;
        this.length = length;
        this.nombreJambe = nombreJambe;

    }
    public void manger(){
        System.out.println("L'animal mange de la nourriture");
    }
    public void mouvement(int vitesse){
        System.out.println("L'animal se deplace a : " + vitesse + "km");
    }

    }

