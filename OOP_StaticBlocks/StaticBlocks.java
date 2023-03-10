package OOP_StaticBlocks;
//static bloc main bloctan once calisan bir bloktur
//2 static blok varsa ustteki once calisir.
/*
static blokun amaci bir class calistiginda bir yerlerden bir
bilgi almaniz gerektiginde class calismadan static blok devreye
girer ve bize istedigimiz bilgileri getiririr.
Ornegin bir oyunda oyun classi calismadan bazi bilgileri bize
getirmesinde kullanilabilir.

Main bloktan altta olmasi onemli degildir her turlu once calisir.
 */
public class StaticBlocks {
    static {
        System.out.println("1. static blok calisti");
    }
    static {
        System.out.println("2. static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }
}
