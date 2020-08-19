
public class Conditionale{
    public static void main(String[] params){
        int a1 = 10;
        int a2 = 12;
        if (a1<a2) {
            System.out.println("Numarul "+a1+" este mai mic decat "+a2);
        }
        int count = 6;
        if (count > 5 & ++count<7){
            ++count;
        }
        System.out.println("Contorul este la valoarea "+count);
        int time = 20;
        String result = (time < 18) ? "Buna ziua" : "Buna seara";
        System.out.println(result);
        int ziua = 3;
        switch (ziua){
            case 1:
                System.out.println("Azi este luni");
                break;
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            case 4:
                System.out.println("Azi este joi");
                break;
            case 5:
                System.out.println("Azi este vineri");
                break;
            case 6:
                System.out.println("Azi este sambata");
                break;
            case 7:
                System.out.println("Azi este duminica");
                break;
        }

    }

}
