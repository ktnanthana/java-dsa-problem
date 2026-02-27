//TC:O(n) SC:O(1)
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class reverseLinkedList{

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node prev = null,next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.value);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head = reverse(head);
        printList(head);    
    }
}