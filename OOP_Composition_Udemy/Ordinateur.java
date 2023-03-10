package OOP_Composition_Udemy;

public class Ordinateur {
    private Moniteur moniteur;
    private Caise caise;
    private CarteMere carteMere;

    public Ordinateur(Moniteur moniteur, Caise caise, CarteMere carteMere) {
        this.moniteur = moniteur;
        this.caise = caise;
        this.carteMere = carteMere;
    }

    public Moniteur getMoniteur() {
        return moniteur;
    }

    public void setMoniteur(Moniteur moniteur) {
        this.moniteur = moniteur;
    }

    public Caise getCaise() {
        return caise;
    }

    public void setCaise(Caise caise) {
        this.caise = caise;
    }

    public CarteMere getCarteMere() {
        return carteMere;
    }

    public void setCarteMere(CarteMere carteMere) {
        this.carteMere = carteMere;
    }
}
