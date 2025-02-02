class Solution {
    int getKthFromLast(Node head, int k) {
        int position = k;
        Node result = head;
        while(head != null && position != 0){
            head = head.next;
            position--;
        }
        if(position != 0){
            return -1;
        }
        while(head != null){
            head = head.next;
            result = result.next;
        }
        return result.data;
    }
}