
public class DetectLoopLinkedList {
    public static boolean detectLoop(Node head) {
        Set<Node> nodes = new HashSet<>();
        while(head.next != null){
            // if node is already present
            if(nodes.contains(head)){
                return true;
            }
            // add node to set
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
}
