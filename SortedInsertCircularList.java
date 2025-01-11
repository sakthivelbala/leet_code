class Solution {
    public Node sortedInsert(Node head, int data) {
        // if less than head
        if(data < head.data){
            // find last node
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            Node n = new Node(data);
            // insert and point to head
            n.next = head;
            temp.next = n;
            // return as head
            return n;
        }
        Node temp = head;
        while(temp.next != head){
            // if between two nodes
            if(data >= temp.data && data < temp.next.data){
                Node node = new Node(data);
                node.next = temp.next;
                temp.next = node;
                return head;
            } else if(temp.next == head){
                temp.next = new Node(data);
                temp.next = head;
                return head;
            }
            temp = temp.next;
        }
        // id last node
        temp.next = new Node(data);
        temp.next.next = head;
        return head;
    }
}
