package OOP_Constructor_Udemy;

public class ObjeReferanslari {
    public static void main(String[] args) {
        Account account1=new Account("Burhan Semiz", "123@gmail.com", "216546");
        Account account2=account1;
        Account account3=account2;
        if (account1==account3) {
            System.out.println("Ayni objeyi gosteriyorlar");
        }
        else {
            System.out.println("Ayni objeyi gostermiyorlar");
        }

    }
}
