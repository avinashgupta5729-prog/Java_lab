
// class Node{
//     int value;
//     Node next;
// }

// public class ques2 {
//     public static Node create(int i , int n){
//         if(i>n){
//             return null;
//         }
//         Node n1=new Node();
//         n1.value=i;
//         n1.next=create(i+1, n);
//         return n1;
//     }
//     static int count(Node head,int count){
//         if(head==null){
//             return count;
//         }
//         return count(head.next, count+1);
//     }

//     public static void main(String[] args) {
//         Node temp=create(2, 5);
//         System.out.println(count(temp, 0));
//     }
// }
