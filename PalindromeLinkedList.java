//   Palindrome Linked List (LeetCode #234)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        // use single pointer and double pointer and find the middle element of the linked list
        ListNode doublePointer = head;
        ListNode singlePointer = head;
        while(doublePointer != null && doublePointer.next != null){
            //push every element in single pointer into the linked list while iterating.
            s.push(singlePointer.val);
            singlePointer = singlePointer.next;
            doublePointer = doublePointer.next.next;
        }
        //if linked list is of odd length then skip the middle element from comparision
        if(doublePointer != null){
            singlePointer = singlePointer.next;
        }
        //pop the stack and compare with the single pointer while iterating thorogh the pointer.
        while(singlePointer!=null){
            // if any node is not matching the it is not the linked list.
            if(s.pop() != singlePointer.val){
                return false;
            }
            singlePointer = singlePointer.next;
        }
        // if every nodes are matching then it is a linked list.
        return true;
    }
}