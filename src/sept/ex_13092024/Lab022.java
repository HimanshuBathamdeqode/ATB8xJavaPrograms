package sept.ex_13092024;

public class Lab022 {
    public static void main (String[]args)
    {
        //Literals - first type boolean = true or false
        boolean is_married = true;
        boolean is_married_himanshu = false;

        int age = 78 ; // literal - integer type - decimal system.
        int binary_num = 0b1010; // literal - binary type - 0b1010 = 10
        int octal = 0101;      // octal literal - base 8
        int hex = 0xface;    //hexadecimal - 16 colour combination are in hex - #28a745

        char c1 = 'A';    // Literal-character type - single character
        char c2 = 'b';
        char c3 = 'c';

        //Escape characters
         char new_line = '\n';
         char tab_line = '\t';
         char back_space = '\b';
         char car_r = '\r';

         //Example

        System.out.println("Himanshu" + '\n'+ "batham" );
        System.out.println("Himanshu" + '\t'+ "batham" );
        System.out.println("Himanshu" + '\b'+ "batham" );
        System.out.println("Himanshu" + '\r'+ "batham" );

    }
}
