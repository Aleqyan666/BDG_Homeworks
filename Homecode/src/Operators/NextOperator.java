package Operators;

public class NextOperator {


    public static void main(String[] args) {
        //task 5 assignment
        int x2 = (int)1.0;
        short y2 = (short)1921222;
        System.out.println(2147483647+1);
        long z2 = (x2 =3);
        boolean b1 = false;
        boolean b2 = (b1 = true);
        System.out.println(x2);

        //Additional tasks
        float y = 2.1f;

        byte a = 5;
        byte b = 10;
        byte c = (byte) (a + b);

        short d = 10;
        short e = (short) (d * c);

        long on = 10;
        int in = 5;
        in *= on;

        //task8

        int first = 10;
        int second = 5;

        int third = first;
        first = second;
        second = third;

        System.out.println(first);
        System.out.println(second);

        //task10
        System.out.println((1+100)*50);

        //Bitwise and Logical
        int A = 8;
        int B = 3;
        System.out.println(A & B);
        System.out.println(A ^ B);
        System.out.println(A | B);
        System.out.println(true || (A < 4));
        System.out.println((B >= 6) || (++A <= 7));
        System.out.println((A<B)?A:B);
        System.out.println(B^B);

        //Shift
        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);
        System.out.println(15>>3);
    }

}
