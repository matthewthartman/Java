import java.math.BigInteger;


public class Combo {

    /**
     * Code that solves the "combination" problem.
     *
     * Example: There are 12 players on a basketball team, and only 5 players can play at any one time.
     * How many combinations of 5 players can be made with all 12 team members? The formula for this is:
     *
     * x = 5! (factorial of the sub group) 120
     * y = 12! (factorial of the total group) 479,001,600
     * z = 7! (factorial of the total - sub) 5,040
     *
     * y / x * z = Number of unique combinations = 792
     */

    public static void main(String[] args) {
        calculateCombo(5, 12);
    }

    static void calculateCombo(int sub, int total) {

        BigInteger subI = new BigInteger(String.valueOf(sub));
        BigInteger totalI = new BigInteger(String.valueOf(total));

        BigInteger x = factorial(subI);
        BigInteger y = factorial(totalI);
        BigInteger z = factorial(totalI.subtract(subI));

        BigInteger result = y.divide(x.multiply(z));
        System.out.println(result);
    }

    static BigInteger factorial(BigInteger bd) {
        if (bd.compareTo(BigInteger.ZERO) == 0) return new BigInteger("1");
        return bd.multiply(factorial(bd.subtract(new BigInteger("1"))));
    }
}