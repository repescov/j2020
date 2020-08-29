package Lectia12.homework;

public class Exercise1 {

    public double media3(int x1, int x2, int x3){
        return this.cat3(this.suma2(this.suma2(x1,x2),x3));
    }
    public int suma2(int x1, int x2){
        return x1+x2;
    }
    public double cat3(int x){
        return (double)x/3;
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println("Media aritmetica a numerelor 1, 6 si 19 este "+exercise1.media3(1,6,19));
    }
}
