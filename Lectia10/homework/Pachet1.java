package pachet1;
public class Pachet1 {
    public void metodaPublicaPachet1(){
        System.out.println("Acesta este pachetul 1, metoda publica");
    }
    void metodaDefaultPachet1(){
        System.out.println("Acesta este pachetul 1, metoda default");
    }
    private void metodaPrivatePachet1(){
        System.out.println("Acesta este pachetul 1, metoda private");
    }
    private void metodaPrivate2Pachet1(){
        System.out.println("Acesta este pachetul 1, metoda private, a doua metoda");
    }
    public void apelareMetodePrivate(){
        Pachet1 b = new Pachet1();
        b.metodaPrivatePachet1();
        Pachet1 b2 = new Pachet1();
        b2.metodaDefaultPachet1();
    }

    public static void main(String[] args) {
        System.out.println("Acesta este pachetul1, main");
        System.out.println("Acum apelam metoda privata in cadrul clase");
        Pachet1 a = new Pachet1();
        a.metodaPrivatePachet1();
        System.out.println("Acum apelam metoda private si default prin metoda publica in cadrul clasei");
        Pachet1 c = new Pachet1();
        c.apelareMetodePrivate();
    }

}