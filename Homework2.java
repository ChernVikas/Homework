package homeworks1;

public class Homework2 {
    public static void main(String[] args) {
       double a = 8;
       double b = 2;
       double c = 5;
       double e = 7;
       double z = 20;
       double x = 68;
       double y = 22;


        System.out.println("c + b / a = )" + (c + b / a));
        System.out.println("(c + b) / a = " + (c + b) / a);
        System.out.println("(c + b++) / a = " + (c + b++) / a);
        System.out.println("(c + b++) / --a = " +(c + b++) / --a);

        double n = 0;
        double s = c * b ;
        double u = b++;

        n = s > u ? ( b++) /--a : (c * b ) /--a;

        System.out.println(n);


        double m = 0;
        double k = c + e;
        double r = y * b;


        m = k > z ? x : r / --a ;

        System.out.println(m);




        }
    }


