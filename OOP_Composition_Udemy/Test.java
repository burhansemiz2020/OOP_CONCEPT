package OOP_Composition_Udemy;

public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Moniteur moniteur=new Moniteur("VS197DE", "Asus", "18.5", resolution  );

        Caise caise=new Caise("Shadow Blade", "Shadow", "LeD");
        CarteMere carteMere=new CarteMere("B250-PRO", "Asus", 10, "Windows 10");
        Ordinateur pc=new Ordinateur(moniteur, caise, carteMere);
        pc.getCaise().ouvrirOrdinateur();
        pc.getMoniteur().fermeLeMoniteur();
        pc.getCarteMere().operatingSystemInstalled("Windows 11 Pro");
        /*
        Java'da composition ve inheritance (miras) arasındaki temel fark, ilişki şekilleridir.

        Inheritance, bir sınıfın, başka bir sınıfın özelliklerini ve davranışlarını doğrudan miras almasıdır.
        Bu, alt sınıfın üst sınıftan tüm özellikleri ve metodları kullanmasına olanak sağlar. Alt sınıf,
        üst sınıfta tanımlanan davranışları değiştirebilir veya yeni davranışlar ekleyebilir, ancak üst
        sınıfta tanımlanan özelliklere erişebilir. Bu şekilde, alt sınıf, üst sınıftan gelen birçok özelliği
        yeniden kullanarak kod tekrarını azaltabilir. Öte yandan, Composition (birleştirme) sınıfın başka
        bir sınıfı içermesi anlamına gelir. Bu ilişki, bir sınıfın diğerini içermesini veya kullanmasını sağlar.
        Bu, sınıflar arasında birçok işbirliği ve bağımlılık kurulmasına olanak sağlar. Bir sınıfın başka bir
        sınıfı kullanarak, o sınıfın işlevselliğini genişletebilir veya değiştirebilirsiniz. Composition ilişkisi,
        bir sınıfın diğer sınıfın yönetimindeki nesneleri kullanmasına olanak sağlar. Bu şekilde, sınıfın herhangi
        bir değişiklik yapmadan kullanabileceği birden fazla nesne olabilir. Kısacası, inheritance, sınıflar
        arasında bir hiyerarşik ilişki kurarken, composition, bir sınıfın başka bir sınıfı içermesi veya
        kullanması yoluyla işbirliği yapmasına olanak sağlar.

        Ornegin: Elbise sınıfını ele alalım. Bir elbisenin renk, beden ve fiyat gibi özellikleri olabilir.
        Bu sınıfın alt sınıfları olarak, gömlek ve pantolon sınıflarını ele alabiliriz. Gömlek ve pantolon,
        Elbise sınıfındaki özellikleri miras alabilir, ancak aynı zamanda kendi özelliklerini de ekleyebilirler.
        Örneğin, Gömlek sınıfı, yaka ve düğme sayısı özelliklerini ekleyebilirken, Pantolon sınıfı, tarz ve
        paça genişliği özelliklerini ekleyebilir. Composition örneğine geçelim. Bir Araba sınıfı düşünelim.
        Araba sınıfı, bir Motor sınıfını içerebilir. Araba sınıfı, Motor sınıfını kullanarak arabayı hareket
        ettirebilir ve aynı zamanda Motor sınıfının özelliklerine erişebilir. Ayrıca, Araba sınıfı, birçok
        Fren sınıfını içerebilir. Bu, arabada birden fazla fren sistemine sahip olabileceği anlamına gelir.
        Araba sınıfı, Fren sınıflarını kullanarak fren yapabilir ve aynı zamanda her fren sisteminin
        özelliklerine erişebilir.
         */



    }
}
