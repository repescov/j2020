package Lectia12;

public class Overload {
    public int suma(int x, int y){
        return x+y;
    }
    public int suma(int x, int y, int z){
        return x+y+z;
    }
    public int sumapare(int n){
        int sum = 0;
        if (n>1) {
            for (int i =0 ; i<=n; i+=2){
                sum +=i;
            }
        } else {
            System.out.println("Trebuie un numar mai mare ca 1");
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Programul a fost initializat");
        Overload ref = new Overload();
        System.out.println("Suma numerelor 2 si 15 este "+ref.suma(2,15));
        System.out.println("Suma numerelor 2, 13 si 15 este "+ref.suma(2,13,15));
        System.out.println("Suma numerelor pare pana la 4 este "+ref.sumapare(2));
    }
}
