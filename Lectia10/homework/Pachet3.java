package pachet3;
import pachet1.Pachet1;
import pachet2.Pachet2;

public class Pachet3 {
    public void metodaPublicaPachet3(){
        System.out.println("Acesta este pachetul 3, metoda publica");
    }
    void metodaDefaultPachet3(){
        System.out.println("Acesta este pachetul 3, metoda default");
    }
    private void metodaPrivatePachet3(){
        System.out.println("Acesta este pachetul 3, metoda private");
    }
    public static void main(String[] args) {
        System.out.println("Acesta este pachetul3, main");
        Pachet1 a = new Pachet1();
        a.metodaPublicaPachet1();
//        a.metodaDefaultPachet1();  eroare metodaDefaultPachet1() is not public in Pachet1; cannot be accessed from outside package
//        a.metodaPrivatePachet1();  eroare metodaPrivatePachet1() has private access in Pachet1
    }
}