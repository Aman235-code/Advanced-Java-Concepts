package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no 1: ");
        int first = ip.nextInt();
        int second = ip.nextInt();
        try{
            int[] a = new int[5];
//            System.out.println(a[6]);
//            a[6] =  first / second;
            int res = first / second;
//            System.out.println(a[6]);
        }
        catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
//            System.out.println("Divide by zero, enter valid values");
        }
//        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
//            System.out.println("Array is out of range");
//        }
        catch (Throwable throwable){
            System.out.println("General exception");
            throw  throwable;
        }
        finally {
            System.out.println("I'm in finally");
        }
    }
}
