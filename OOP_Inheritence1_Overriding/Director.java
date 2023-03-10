package OOP_Inheritence1_Overriding;

public class Director extends Employer {

    private int responsable;//une qualification specifique

    public Director(String nom, int salaire, String department, int responsable) {

        super(nom, salaire, department);//On a appele constructor via le method de super
        /*
        On peut ajouter des characteristiques specifics pour le directeur
        sous cette classe
         */
        this.responsable = responsable;
    }
    public void augmenterSalaire(int augmentation){
        System.out.println("Il y a " + augmentation +  " euro augmentation pour les employees");

    }
    public void montreLinfos(){

       //System.out.println("Nom: "+getNom());
       //System.out.println("Salaire: "+getSalaire());
       //System.out.println("Department: "+getDepartment());
        super.montreLinfos();

        System.out.println("Nombre des responsables: " +this.responsable);
    }
}
