package Lectia12.homework;

public class Exercise6 {
    public Exercise6 metoda1(int i){
        return this;
    }
    public Exercise6 metoda1(){
        return new Exercise6();
    }

    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();
        obj.metoda1(1);
        Exercise6 obj2 = obj.metoda1(1);
    }
}
