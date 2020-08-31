package Lectia12.homework;

public class Exercise5 {
    int x;
    int y;

    Exercise5() { //constructorul implicit
        x = 10;
        y = 100;
    }

    // metoda care ne va avea cuvantul cheie this ca argument
    public void afiseaza(Exercise5 a) {
        System.out.println("x = " + a.x + "; y = " + a.y);
    }

    public void obtine() {
        afiseaza(this);
    }

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        exercise5.obtine();
//        exercise5.afiseaza(this);  // Error:(21, 28) java: non-static variable this cannot be referenced from a static context
    }
}
