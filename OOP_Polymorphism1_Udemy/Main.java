package OOP_Polymorphism1_Udemy;

class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String parlez() {
        return "Animal parle";
    }
}

class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }

    @Override
    public String parlez() {
        return this.getNom() + " miauler...";
    }
}

class Chien extends Animal {
    public Chien(String nom) {
        super(nom);

    }

    @Override
    public String parlez() {
        return this.getNom() + " aboyer...";
    }
}

class Cheval extends Animal {
    public Cheval(String nom) {
        super(nom);
    }

    @Override
    public String parlez() {
        return this.getNom() + " henir...";
    }
}

public class Main {
    public static void parlez(Animal animal){
        System.out.println(animal.parlez());
    }
    public static void main(String[] args) {
                /*
                Bir java dosyasinin icine birden fazla class koyabiliyoruz.
                Burada farkli dosyalar acmayacagiz. Once yukariya classin
                ustune bir super class girecegiz. Burda ilk basta public
                koymuyoruz, direct class diyerek basliyoruz.
                 */
      // Animal animal1 = new Chat("Tekir");//Tekir miauler...
      // Animal animal2 = new Chien("Karabas");//Karabas aboyer...
      // Animal animal3 = new Cheval("Sahbatur");//Sahbatur henir...
      // System.out.println(animal1.parlez());
      // System.out.println(animal2.parlez());
      // System.out.println(animal3.parlez());
        parlez(new Chat("Tekir"));
        parlez(new Chien("Karabas"));
        parlez(new Cheval("Sahbatur"));
    }
}

