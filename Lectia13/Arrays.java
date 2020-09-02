package Lectia13;

public class Arrays {

    public static void main(String[] args) {
        int[] arr; // Declaram array cu elemente intregi

        arr = new int[5]; // am alocat 5 elemente intregi pentru array
        arr[0] = 10; // am asociat primul element cu 10
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //accesam elementele de tip array
        for (int i = 0 ; i< arr.length; i++) {
            System.out.println("Elementul pe pozitia "+i+" este "+arr[i]);
        }


    }
}
