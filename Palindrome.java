import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    /**
     * Given a linked list of integers, determine if the list represents a palindrome
     * (same values both forward and reverse). Linked list implementation provided below
     *
     */

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-1);
        ListNode node2 = node1.addNode(0);
        ListNode node3 = node2.addNode(-1);


        printValues(node1);
        System.out.println(isListPalindrome(node1));
    }

    //Implement this method
    public static boolean isListPalindrome(ListNode node) {
        if (node != null) {
            List<Integer> array = new ArrayList<>();
            array.add(node.val);
            while (node.next != null) {
                array.add(node.next.val);
                node = node.next;
            }
            List<Integer> reversed = new ArrayList<>(array);
            Collections.reverse(reversed);
            return array.equals(reversed);
        }
        return false;
    }

    static void printValues(ListNode node) {
        System.out.println(node.val);
        if (node.next != null) {
            printValues(node.next);
        }
    }

    public static class ListNode {
        ListNode next;
        Integer val;
        ListNode(int valIn) {
            val = valIn;
        }
        ListNode addNode(int valIn) {
            ListNode newNode = new ListNode(valIn);
            next = newNode;
            return newNode;
        }
    }
}
