public class MiscellaneousOperators {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        /*
        Output
        Value of b is : 30
        Value of b is : 20
        */
    }
}
