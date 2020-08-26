public class Clasa1 {
    public void metodaIntreg(int numar){
        System.out.println("Numarul intreg este "+numar);
    }
    public void metoda2String(String s1, String s2){

    }
    public void metoda0String(){
        System.out.println("A fost apelata metoda string fara parametri");
    }
    public void metodaChar(char ch1){
        int a=ch1;
        System.out.println("Numarul a fost convertit in "+a);
    }
    public void sumaN(int n){
        System.out.println("Suma numerelor de la 1 la "+n+" este "+n*(n+1)/2);
    }
    public void afisarePare(int n){
        System.out.println("A fost initializata metoda ce va tipari numerele pare pana la "+n);
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public void afisareHello(){
        for (int i = 1; i<11; i++){
            System.out.println("Hello");
        }
    }
    public void afisareImpare(int n){
        System.out.println("A fost initializata metoda ce va tipari numerele impare pana la "+n);
        for (int i = 0; i < n; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}