
public class Main {
    public static void main(String[] args) {

        char first = 'G';
        int second = 89;
        byte third = 4;
        short four = 56;
        float five = 4.7333436f;
        double six = 4.335453532;
        long seven = 12121;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);




        Character Prim1 = 'G';
        Integer Prim2 = new Integer(89);
        Byte Prim3 = 4;
        Short Prim4 = 56;
        Float Prim5 =  new Float(4.7333436f);
        Double Prim6 = new  Double(4.335453532);
        Long Prim7 = new Long(12121);
        System.out.println(Prim1);
        System.out.println(Prim2);
        System.out.println(Prim3);
        System.out.println(Prim4);
        System.out.println(Prim5);
        System.out.println(Prim6);
        System.out.println(Prim7);



        int n = 345;
//    System.out.println(n % 1000/100);/* 345 % 1000 = 0,345 (345 в остатке), потом 345 / 100 = 3 (выводим 3) */
        System.out.println(n / 100); /* 345 / 100 = 3 */
        System.out.println(n % 100/10); /* 345 % 100 = 3,45 (45 в остатке), потом 45 / 10 = 4.5 (выводим 4) */
        System.out.println(n % 10); /* 345 % 10 = 34.5 (5 в остатке и выводим на экран) */

    }
}