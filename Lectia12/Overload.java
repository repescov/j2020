package Lectia12;

public class Overload {
    public int suma(int x, int y){
        return x+y;
    }
    public int suma(int x, int y, int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println("Programul a fost initializat");
        Overload ref = new Overload();
        System.out.println("Suma numerelor 2 si 15 este "+ref.suma(2,15));
        System.out.println("Suma numerelor 2, 13 si 15 este "+ref.suma(2,13,15));
    }
}
