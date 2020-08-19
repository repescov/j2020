public class Operatori{
    public static void main(String[] params){
        int s = 10;
        int b = ++s + s + --s - --s + s++;
        System.out.println("Rezultatul adunarii este "+b);
        double d = 15.3;
        int i = (int)d;
        float f=30F;
        System.out.println("Rezultatul operatorilor este "+i);
        int a1=10;
        int b1=22;
        a1 += b1;
        System.out.println("Suma este  "+a1);
    }

}