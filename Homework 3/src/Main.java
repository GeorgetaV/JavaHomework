public class Main {
    public static void main(String[] arg) {


        String str = new String("I study Basic Java!");

        printString(str);

    }

    public static void printString(String str) {
        System.out.println(str);
        System.out.println(str.charAt(17));
        System.out.println(str.substring(14, 18));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }
}
