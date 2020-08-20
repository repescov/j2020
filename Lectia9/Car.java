public class Car{
    //cream o metoda viteza maxima
    public void vitezaMaxima(){
        System.out.println("Masina merge cu viteza maxima");
    }
    //Cream o metoda ce ne da viteza, are un parametru
    public void viteza(int VitezaMaxima){
        System.out.println("Viteza maxima este "+VitezaMaxima);
    }
    // in interiorul main, vom chema aceste metode
    public static void main(String[] args){
        Car MasinaMea = new Car();
        MasinaMea.vitezaMaxima();
        MasinaMea.viteza(199);
    }
}