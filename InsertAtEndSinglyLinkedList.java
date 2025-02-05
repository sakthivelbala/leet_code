public class InsertAtEndSinglyLinkedList {
    Node insertAtEnd(Node head, int x) {
        if(head == null){
            return new Node(x);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(x);
        return head;
    }
}
