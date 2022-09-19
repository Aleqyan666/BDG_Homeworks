package Operators;

public class Operator {

    public static void main(String[] args) {
        //Arithmetic task1-3
        int a = 8;
        int b = 6;

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);

        double c = 6.4;
        double d = 0.03;

        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c-d);
        System.out.println(c%d);

        int x = 2 * (((5 + 3) * 4) - 8);
        int y = 2 * 5 + 3 * 4 - 8;

        System.out.println(x);
        System.out.println(y);

        //unary task4
        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e +92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int xx = 3;
        int yy = ++xx * 5 / xx-- + --xx;
        System.out.println("xx is " + xx);
        System.out.println("yy is " + yy);
    }
}
