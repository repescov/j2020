public class SimpleStrings {
    public static String s1;
    public static String s2;
    public static void main(String[] args) {
        String text="Acesta este un simplu text";
        System.out.println(text);
        s1 = "Text 1";
        s2 = "Text 2";
        System.out.println(s1+s2);
        String st1 = "Text 1 ";
        String st2 = " Text 2 ";
        System.out.println(st1+st2);
        String t1 = new String("Vasile");
        String t2 = t1.concat("Bolea");
        System.out.println(t1);
        System.out.println(t2);
        String str1 = new String("Ion");
        String str2 = new String("Ion");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}