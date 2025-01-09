class Solution {
    Node removeDuplicates(Node head) {
        //if only one node or null return it
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            // if next data is same as current node data change pointer of node to following node
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            } else {
                // else iterate to next node
                temp = temp.next;
            }
        }
        // return header
        return head;
    }
}