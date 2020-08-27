package Lectia11;
//Exercitiile sunt preluate de pe https://www.w3resource.com/java-exercises/string/index.php

public class Exercitii {
    //    1. Write a Java program to get the character at the given index within the String
//    Sample Output:
//    Original String = Java Exercises!
//    The character at position 0 is J
//    The character at position 10 is i
    public void exercitiul1() {
        String string = "Exercitii Java!";
        int i1 = 0, i2 = 10;
        System.out.println("Caracterul din pozitia " + i1 + " este " + string.charAt(i1));
        System.out.println("Caracterul din pozitia " + i2 + " este " + string.charAt(i2));
    }

    //2. Write a Java program to get the character (Unicode code point) at the given index within the String. Go to the editor
//    Sample Output:
//    Original String : Universitatea de Stat din Tiraspol
//    Character(unicode point) = 105
//    Character(unicode point) = 97
    public void exercitiul2() {
        String string = "Universitatea de Stat din Tiraspol";
        int i1 = 2, i2 = 12;
        System.out.println("Caracterul " + string.charAt(i1) + " de pe pozitia " + i1 + " are codul " + string.codePointAt(i1));
        System.out.println("Caracterul " + string.charAt(i2) + " de pe pozitia " + i2 + " are codul " + string.codePointAt(i2));
    }

    //3. Write a Java program to get the character (Unicode code point) before the specified index within the String. Go to the editor
//    Sample Output:
//    Original String : w3resource.com
//    Character(unicode point) = 119
//    Character(unicode point) = 99
    public void exercitiul3() {
        String string = "Universitatea de Stat din Tiraspol";
        int i1 = 2, i2 = 12;
        System.out.println("Caracterul dinaintea caracterului " + string.charAt(i1) + " de pe pozitia " + i1 + " are codul " + string.codePointBefore(i1));
        System.out.println("Caracterul dinaintea caracterului " + string.charAt(i2) + " de pe pozitia " + i2 + " are codul " + string.codePointBefore(i2));
    }
//4. Write a java program to count a number of Unicode code points in the specified text range of a String. Go to the editor
//Sample Output:
//    Original String : w3rsource.com
//    Codepoint count = 9


    public static void main(String[] args) {
        Exercitii exercitii = new Exercitii();
        exercitii.exercitiul1();
        exercitii.exercitiul2();
        exercitii.exercitiul3();
    }
}
