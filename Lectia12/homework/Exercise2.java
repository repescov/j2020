package Lectia12.homework;

public class Exercise2 {

    public double medie(double x1, double x2){
        return (x1+x2)/2;
    }
    public double medie(double x1, double x2, double x3){
        return this.medie((double)4/3*this.medie(x1,x2),x3*(double)2/3);
    }
    public double medie(double x1, double x2,double x3, double x4){
        return this.medie(this.medie(x1,x2),this.medie(x3,x4));
    }


    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        System.out.println("Media numerelor 1 si 4  este "+exercise2.medie(1,4));
        System.out.println("Media numerelor 1, 4 si 9 este "+exercise2.medie(1,4,9));
        System.out.println("Media numerelor 1, 4, 7 si 9 este "+exercise2.medie(1,4,7,9));
    }
}
