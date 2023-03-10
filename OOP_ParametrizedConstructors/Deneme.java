package OOP_ParametrizedConstructors;

public class Deneme {
    String isim="Ali Veli";
    int yas=20;

    public Deneme(String isim,int yas){
        this.isim=isim="Fatih";
        this.yas=yas=30;
    }

    public static void main(String[] args) {
        Deneme obj=new Deneme("Fatih", 35);
        System.out.println("Isim : " +obj.isim+
                           " \nYas : " +obj.yas);
    }
}
