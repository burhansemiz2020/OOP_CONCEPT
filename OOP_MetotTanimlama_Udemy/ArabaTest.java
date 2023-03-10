package OOP_MetotTanimlama_Udemy;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.setRenk("Kirmizi");
        araba1.setKapilar(4);
        araba1.setTekerlekler(4);
        araba1.setMotor("16V");
        araba1.setModel("Renault");



        System.out.println("Arabanin modeli: "+araba1.getModel()+"\nArabanin tekerlek sayisi: "
                            +araba1.getTekerlekler()+"\nArabanin rengi: "+araba1.getRenk()+
                            "\nArabanin motoru: "+araba1.getMotor()+"\nArabanin kapi sayisi: "+araba1.getKapilar());

        Araba araba2 = new Araba();
        araba2.setKapilar(10);



        //burda yapilan hatalar objenin public olmasindan kaynaklandi
        /*
        Java da encapsulation metodu objenin olusturuldugu classta tum
        ozellikleri private yapmaktir. Peki biz bu alanlara direk
        erisemezsek dolayli bir yontem kullanacagiz. Bu erisim encapsulation dir.
         */
        Araba araba3 = new Araba();
        araba3.setRenk("Kirmizi");
        araba3.setKapilar(4);
        araba3.setTekerlekler(4);
        araba3.setMotor("16V");
        araba3.setModel("Renault");

        System.out.println("Arabanin modeli: "+araba3.getModel()+"\nArabanin tekerlek sayisi: "
                            +araba3.getTekerlekler()+"\nArabanin rengi: "+araba3.getRenk()+
                            "\nArabanin motoru: "+araba3.getMotor()+"\nArabanin kapi sayisi: "+araba3.getKapilar());


    }
}
