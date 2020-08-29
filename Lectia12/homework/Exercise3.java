package Lectia12.homework;

public class Exercise3 {
    String nume,prenume;
    double medie;
    Exercise3(){
        nume = "Nume";
        prenume = "Prenume";
        medie = 0;
        System.out.println("Parametrii impliciti nu au fost stabiliti");
    }
    Exercise3(String nume){
        this();
        this.nume = nume;
        System.out.println("Este nevoie de introdus prenumele si media");
    }
    Exercise3(String nume, String prenume){
        this();
        this.nume = nume;
        this.prenume = prenume;
        System.out.println("Este nevoie de introdus si media");
    }
    Exercise3(String nume, double medie){
        this();
        this.nume = nume;
        this.medie = medie;
        System.out.println("Este nevoie de introdus si prenumele");
    }
    Exercise3(String nume, String prenume, double medie){
        this.nume = nume;
        this.prenume = prenume;
        this.medie = medie;
    }
    public void afiseaza(String nume, String prenume, double medie){
        System.out.println("Nume: "+this.nume+"; Prenume: "+this.prenume+"; Media notelor: "+this.medie);
    }

    public static void main(String[] args) {
        System.out.println("--------Constructorul implicit va afisa--------");
        Exercise3 ref1 = new Exercise3(); // va chema constructorul implicit
        ref1.afiseaza(ref1.nume,ref1.prenume,ref1.medie);
        System.out.println("--------Constructorul in care introducem doar numele va afisa--------");
        Exercise3 ref2 = new Exercise3("Repesco"); //
        ref2.afiseaza(ref2.nume,ref2.prenume,ref2.medie);
        System.out.println("--------Constructorul in care introducem doar numele si media va afisa--------");
        Exercise3 ref3 = new Exercise3("Repesco",9.8); //
        ref3.afiseaza(ref3.nume,ref3.prenume,ref3.medie);
        System.out.println("--------Constructorul in care introducem toti parametrii va afisa--------");
        Exercise3 ref4 = new Exercise3("Repesco","Vadim",9.8); //
        ref4.afiseaza(ref4.nume,ref4.prenume,ref4.medie);
            }
}
