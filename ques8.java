class Node{
    int val;
    Node next;
}
public class ques8 {
    public static Node create(int i,int n){
        if(i > n){
            return null;
        }
        Node n1 = new Node();
        n1.val = i;
        n1.next = create(i+1, n);
        return n1;
    }
    public static void print(Node temp){
        if(temp == null){
            return;
        }
        System.out.println(temp.val + " ");
        print(temp.next); 
    }
    public static Node remove(Node head,int target){
         if(head == null){
            return null;
         }
         if(head.val == target){
            return remove(head.next, target);
         }
            head.next=remove(head.next, target);
            return head;     
    }
    public static void main(String[] args) {
        Node head = create(1, 10);
        Node temp=remove(head, 6);
        print(temp);
    }
}