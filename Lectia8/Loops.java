public class Loops{
    public static void main(String[] params){
        int ii = 0;
        while (ii < 5){
            System.out.println(ii);
            ii++;
        }
    /*    int count1 = 1;
        while (count1 <=10){
            int count2 = 1;
            while (count2 <= 20){
                System.out.println(count1+ " +" +count2);
                count2++;
            }
            count1++;
        }*/
        System.out.println("Ciclul cu ajutorul for:");
        for (int j = 0; j<5; j++){
            System.out.println(j);
            if ( j==2 ) {
                break; // Se va intrerupe ciclul la pasul j = 2
            }
        }
        String[] cars = {"Ford","BMW","NISSAN","VAZ"};
        for (String k:cars){
            System.out.println(k);
        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 9) {
                break;
            }
        }
    }
    }