package clase1_Activ2.BigInteger;

import java.math.BigInteger;


public class FactorialBigInteger {
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }


    public static void main(String[] args) {
        int number = 50;
        BigInteger bigNumber = BigInteger.valueOf(number);
        BigInteger result = factorial(bigNumber);
        System.out.println("El factorial de " + number + " es " + result);
    }
}

