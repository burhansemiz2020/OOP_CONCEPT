package OOP_Inheritence1_Overriding;

public class Employer {
    /*
    cette class est une SuperClass
    parce que dans cette class il
    y a des employees ou des directeurs
    etc. En fait toutes les personnel
    d'une societe sont employees.
    Mais au dessous de cette class il y
    a qq differences. A l'instant on vera
    ces differences.
    Et alors
    Employee == SuperClass
    Director == SubClass*/
    private String nom;
    private int salaire;
    private String department;

    public Employer(String nom, int salaire, String department) {
        this.nom = nom;
        this.salaire = salaire;
        this.department = department;
    }
    public void travail(){
        System.out.println("Le travailleur travaille");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void montreLinfos(){
        System.out.println("Nom: "+nom);
        System.out.println("Salaire: "+salaire);
        System.out.println("Department: "+department);



    }
    public void changeLeDepartement(String nouvelleDepartement){
        System.out.println("Le department change...");
        this.department = nouvelleDepartement;
        System.out.println("NouvelleDepartement : " + this.department);


    }

        }




