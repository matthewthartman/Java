import java.io.*;
import java.util.*;

/*
You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

An array of integers.

Guaranteed constraints:
0 ≤ a.length ≤ 10E6,
-10E9 ≤ a[i] ≤ 10E9.

[input] array.integer b

An array of integers.

Guaranteed constraints:
0 ≤ b.length ≤ 10E6,
-10E9 ≤ b[i] ≤ 10E9.

[input] integer v

Guaranteed constraints:
-10E9 ≤ v ≤ 10E9.

[output] boolean

true if there are two elements from a and b which add up to v, and false otherwise.
 */

class SumOfTwo {
    static boolean sumOfTwo(int[] a, int[] b, int v) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        }

        Set<Integer> firstSet = new HashSet<>();
        for (int val : a) {
            firstSet.add(val);
        }

        for (int val : b) {
            if (firstSet.contains((v - val))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {
                {1,2,3},
                {3,1,2,6,10,108},
                {1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10},
                {-10,-5,0,5,10},
                {-10,-5,0,5,10}
        };
        int[][] b = new int[][] {
                {10, 20, 30, 40},
                {3,1,2,6,10,107},
                {1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10},
                {-20,-25,-55,-100,-2,5,100,66},
                {1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10,1,2,3,4,5,6,78,9,10},
        };
        int[] v = new int[] {
                42,
                10000,
                88,
                95,
                -10000
        };
        boolean[] expected = new boolean[]{
                true,
                false,
                true,
                true,
                false
        };
        for (int i = 0; i < expected.length; i++) {
            boolean res = sumOfTwo(a[i],b[i],v[i]);
            boolean exp = expected[i];
            if(res == exp) {
                System.out.println("Test case " + ( i + 1) + " is successful.");
            } else {
                System.out.println("!!!! Test case " + ( i + 1) + " failed. Expected " + exp + " but got " + res);
            }
        }

        int[] aa = {1, 2, 3}, bb = {10, 20, 30, 40};
        System.out.println("Simple test, expecting true: " + sumOfTwo(aa, bb, 42));

        System.out.println("Simple test, expecting false: " + sumOfTwo(aa, bb, 44));

        int ELEMENTS = 1000000;
        aa = java.util.stream.IntStream.range(0, ELEMENTS).toArray();
        int vv = aa[ELEMENTS-1] + aa[ELEMENTS-1]; //true

        long start = System.currentTimeMillis();
        System.out.println("Scaled test, expecting true: " + sumOfTwo(aa, aa, vv) + " (time taken: " + (System.currentTimeMillis() - start) + ")");

        vv = 100000000; //false
        start = System.currentTimeMillis();
        System.out.println("Scaled test, expecting false: " + sumOfTwo(aa, aa, vv) + " (time taken: " + (System.currentTimeMillis() - start) + ")");
    }
}
