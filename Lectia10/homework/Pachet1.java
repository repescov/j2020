package pachet1;
public class Pachet1 {
    int x1 = 10;
    int x2 = 11;
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
    public int obtinex1(){ //metoda ce ne va permite apelarea proprietatii private
        return x1;
    }
    public int obtinex2(){//metoda ce ne va permite apelarea proprietatii private
        return x2;
    }
    public void atribuirex1(int a){//metoda ce ne va permite modificarea proprietatii private
        x1 = a;
    }
    public void atribuirex2(int a){//metoda ce ne va permite modificarea proprietatii private
        x2 = a;
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