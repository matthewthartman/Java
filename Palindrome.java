import java.io.*;
import java.util.*;

/**
 * Given a singly linked list of integers, determine whether or not it's a palindrome.
 *
 * Example
 * For l = [0, 1, 0], the output should be
 * isListPalindrome(l) = true;
 *
 * For l = [1, 2, 2, 3], the output should be
 * isListPalindrome(l) = false.
 *
 * Input/Output
 *
 * [time limit] 3000ms (java)
 *
 * [input] linkedlist.integer l
 * A singly linked list of integers.
 *
 * Guaranteed constraints:
 * 0 ≤ list size ≤ 5 · 105,
 * -109 ≤ element value ≤ 109.
 *
 * [output] boolean
 * Return true if l is a palindrome, otherwise return false.
 *
 *
 * Sample Test case
 * l: [0, 1, 0]
 * Expected Output:
 * true
 *
 */

public class Palindrome {

    // Definition for singly-linked list:
    public static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;

        ListNode<T> addNode(T t) {
            next = new ListNode<>(t);
            return next;
        }
    }

    public static boolean isListPalindrome(ListNode<Integer> node) {
        if (node != null) {
            List<Integer> array = new ArrayList<>();
            array.add(node.value);
            while (node.next != null) {
                array.add(node.next.value);
                node = node.next;
            }
            List<Integer> reversed = new ArrayList<>(array);
            Collections.reverse(reversed);
            return array.equals(reversed);
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode<Integer> node =
                new ListNode<>(-2);
        node.addNode(1)
                .addNode(0)
                .addNode(-3)
                .addNode(0)
                .addNode(1)
                .addNode(-2);

        System.out.println("First test,  expecting true : " + isListPalindrome(node));

        node = new ListNode<>(-2);
        node.addNode(1)
                .addNode(0)
                .addNode(-3)
                .addNode(0)
                .addNode(1)
                .addNode(-1);

        System.out.println("Second test, expecting false: " + isListPalindrome(node));
    }
}
