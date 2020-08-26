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
        System.out.println("--------------Acesta este pachetul3, main--------------");
        System.out.println("--------------Aratam ca putem apela orice metoda din Pachet3--------------");
        Pachet3 a1 = new Pachet3();
        a1.metodaPublicaPachet3();
        a1.metodaDefaultPachet3();
        a1.metodaPrivatePachet3();
        System.out.println("--------------Apelam la metoda publica din alt pachet--------------");
        Pachet1 a = new Pachet1();
        a.metodaPublicaPachet1();
//        a.metodaDefaultPachet1();  eroare metodaDefaultPachet1() is not public in Pachet1; cannot be accessed from outside package
//        a.metodaPrivatePachet1();  eroare metodaPrivatePachet1() has private access in Pachet1
        System.out.println("--------------Acum apelam metoda privata si default prin metoda publica din alt pachet--------------");
        Pachet1 c = new Pachet1();
        c.apelareMetodePrivate();
        System.out.println("--------------Citim proprietatile private ale clasei pachet 1 -------------");
        System.out.println("prima proprietate:"+c.obtinex1()+"; a doua: "+c.obtinex2());
        System.out.println("--------------Modificam proprietatile private ale clasei pachet 1 -------------");
        c.atribuirex1(100);
        c.atribuirex2(200);
        System.out.println("prima proprietate:"+c.obtinex1()+"; a doua: "+c.obtinex2());
    }
}