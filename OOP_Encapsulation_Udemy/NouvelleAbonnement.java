package OOP_Encapsulation_Udemy;

public class NouvelleAbonnement {
    private String abonnementNom;
    private int credite=120;
    private String ville;

    public NouvelleAbonnement(String nom, int credite, String ville) {
        this.abonnementNom = nom;
        if (credite>=0&&credite<=120){
            this.credite=credite;
        }
        this.ville = ville;
    }
    public void consommeGaz(int amount){

        if ((this.credite-amount) < 0){
            System.out.println("Pas assez credite.");

        }
        else{
            this.credite-=amount;
            if (this.credite<=0){
                System.out.println("Votre credite a finit, Depose l'argent a l'automate"+
                        " Limite de credite = 120 Euro");
            }else{
                System.out.println("Nouvelle credite = "+credite);
            }
        }
    }
    public void decouvreCredit(){
        System.out.println("Credite = " +credite);
    }
}
