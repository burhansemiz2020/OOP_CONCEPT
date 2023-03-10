package OOP_Composition_Udemy;

public class CarteMere {
    /*
    Burada bilgisayar orneginden yola cikarak anakarta ait ozellikleri
    girecegiz.
     */
    //en premier on ajout les variables
    private String model;
    private String fabricant;
    private int nSlots;
    private String operatingSystem;

        public void operatingSystemInstalled(String operatingSystem){
            this.operatingSystem = operatingSystem;
            System.out.println("Operating System a ete installee: "+ operatingSystem );


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

    public int getnSlots() {
        return nSlots;
    }

    public void setnSlots(int nSlots) {
        this.nSlots = nSlots;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    //On cree un constructor
    public CarteMere(String model, String fabricant, int nSlots, String operatingSystem) {
        this.model = model;
        this.fabricant = fabricant;
        this.nSlots = nSlots;
        this.operatingSystem = operatingSystem;


    }

}

