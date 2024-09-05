package clase1_Activ2.Long;

public class FactorialLong {
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        long number = 20;
        long result = factorial(number);
        System.out.println("El factorial de " + number + " es " + result);
    }
}

