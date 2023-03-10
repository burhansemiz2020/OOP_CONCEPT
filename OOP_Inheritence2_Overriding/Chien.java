package OOP_Inheritence2_Overriding;

public class Chien extends Animaux{
    private int nombreDents;

    public int getNombreDents() {
        return nombreDents;
    }

    public void setNombreDents(int nombreDents) {
        this.nombreDents = nombreDents;
    }
    public void courir(int vitesse){
        System.out.println("Le chien court");
        super.mouvement(vitesse);
    }

    public Chien(String nom, int kg, int length, int nombreJambe, int nombreDents) {
        super(nom, kg, length, nombreJambe);
        this.nombreDents = nombreDents;

    }
}

