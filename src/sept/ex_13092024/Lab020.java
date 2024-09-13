package sept.ex_13092024;

public class Lab020{
    public static void main(String[]args){
        // formatting
        // %d -any integer, byte, short, long
        // %s - String
        // %c - char
        // %f - float, double
        int num  = 10;
       // System.out.println( "Value of %d");
        //System.out.println( "2 * 1 = 2" );
        System.out.printf( "%d * %d = %d", num, 1, num);
        System.out.println();
        System.out.printf( "%d * %d = %d", num, 2, num*2);
        System.out.println();
        System.out.printf( "%d * %d = %d", num, 3, num*3);
        System.out.println();
        System.out.printf( "%d * %d = %d", num, 4, num*4);
        System.out.println();
        System.out.println("continue till 10");
        System.out.printf( "%d * %d = %d", num, 10, num*10);

    }
}