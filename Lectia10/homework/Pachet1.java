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

    public static void main(String[] args) {
        System.out.println("Acesta este pachetul1, main");
    }
}