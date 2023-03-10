package OOP_ConstructorCall;
public class Deneme {
    String name="Burhan";
    int age=38;
    public Deneme(){
        name="Zeynep";
    }
    public Deneme(String name, int age) {
        this();
        this.age=age;
    }
    public static void main(String[] args) {
        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme("Ahmet", 15);

        System.out.println("name : "+obj1.name+
                        " \nage : "+obj2.age);
    }
}

