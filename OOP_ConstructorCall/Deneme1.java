package OOP_ConstructorCall;

public class Deneme1 {
    String name="John Doe";
    int age=40;

    public Deneme1(){
        name="Seher";
        System.out.println("name: " +name);
    }
    public Deneme1(String name) {
        this();
        this.age=30;
        System.out.println("name: " + name);
    }
    public Deneme1(String name, int age){
        this("Murat");
        this.age=45;

    }
    public static void main(String[] args) {
        Deneme1 obj1=new Deneme1("Esra");
        Deneme1 obj2=new Deneme1("Fatih", 15);
        System.out.println("name: " + obj1.name);
        System.out.println("name: " + obj2.name);


    }
}
