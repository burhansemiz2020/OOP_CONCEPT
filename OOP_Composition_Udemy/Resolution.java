package OOP_Composition_Udemy;

public class Resolution {
    private int largeur;
    private int hauteur;

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public Resolution(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;


    }
}
