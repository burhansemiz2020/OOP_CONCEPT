package OOP_Composition_Udemy;

public class Caise {
    private String model;
    private String fabricant;
    private String materiel;

    public Caise(String model, String fabricant, String materiel) {
        this.model = model;
        this.fabricant = fabricant;
        this.materiel = materiel;



    }
    public void ouvrirOrdinateur(){
        System.out.println("L'ordi ouvre...");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }
}
