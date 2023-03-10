package OOP_Composition_Udemy;

public class Moniteur {
    private String model;
    private String fabricant;
    private String dimension;
    private Resolution resolution;

    public void fermeLeMoniteur() {
        System.out.println("Le moniteur s'éteint...");
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

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Moniteur(String model, String fabricant, String dimension, Resolution resolution) {
        this.model = model;
        this.fabricant = fabricant;
        this.dimension = dimension;
        this.resolution = resolution;


    }

}
