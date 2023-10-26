import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        //System.out.println(fib(26));

        //System.out.println("Input " + num + " is " + ((!isPrime(num) ? "not ": "") + "prime."));

        //System.out.println(factorial(6900));

        Scanner in = new Scanner(System.in);
        String input = null;
        while (true) {
            input = in.next();
            System.out.println(input + " % 10000007 = " + new BigInteger(input).mod(new BigInteger("10000007")));
        }

        /*BigInteger a = new BigInteger("145785635595363569532135132");
        BigInteger b = new BigInteger("3151635135413512165131321321");
        BigInteger c = new BigInteger("999874455222222200651351351");
        BigInteger M = new BigInteger("10000007");
        System.out.println((a.multiply(b).multiply(c).mod(M)));

        BigInteger i = new BigInteger("1");
        i = new BigInteger(String.valueOf(i.multiply(a).mod(M)));
        System.out.println("i = " + i);
        i = new BigInteger(String.valueOf(i.multiply(b).mod(M)));
        System.out.println("i = " + i);
        i = new BigInteger(String.valueOf(i.multiply(c).mod(M)));
        System.out.println("i = " + i);*/

    }

    static long factorial(long n) {
        long f = 1;
        long M = 10000007;
        for (int i = 1; i <= n; i++) {
            f = (f * i) % M;
        }
        return f;
    }

    //Test if number is prime
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                //System.out.println("Exiting on " + i);
                return false;
            }
        }
        return true;
    }

    //Get Fibonacci sequence value at input
    static int fib(int n) {
        int prev = 0, next = 1, result = 0;
        for (int i = 0; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }

}
