package OOP_Encapsulation_Udemy;

public class Abonnement {
    /*
    Burada encapsulation in faydalarini gorecegiz
     */
    public String nom;
    public int credite;
    public String ville;//burda encapsulation a aykiri bir durum var aslinda



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
