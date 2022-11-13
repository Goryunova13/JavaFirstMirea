package ru.mirea.task18;

public class num1_1
{
    static public void exceptionDemo()
    {
        System.out.println( 2 / 0 );
    }

    public static void main(String[] args) {
        exceptionDemo();
    }

    public static class num1_2
    {
        static public class Exception1
        {
            public void exceptionDemo()
            {
                try
                {
                    System.out.println( 2/0 );
                } catch ( ArithmeticException e ) {
                    System.out.println("Attempted division by zero");
                }
            }
        }
    }
}