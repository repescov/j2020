package Lectia13;

class Animal {// acesta va fi superclasa

    public void sunetAnimal() {
        System.out.println("Animalul emite un sunet");
    }
}

class Caine extends Animal { //Am extins clasa initiala, va fi o clasa child
    public void sunetAnimal() {
        super.sunetAnimal();//am chemat metoda din clasa parinte
        System.out.println("Cainele latra: ham ham!");
    }
}

public class UtilizareSuper {
    public static void main(String[] args) {
        Animal caine = new Caine();
        caine.sunetAnimal();

    }
}
