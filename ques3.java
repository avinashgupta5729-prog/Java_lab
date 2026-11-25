
// class Node{
//     int value;
//     Node next;
// }

// public class ques3 {
//     public static Node create(int i , int n){
//         if(i>n){
//             return null;
//         }
//         Node n1=new Node();
//         n1.value=i;
//         n1.next=create(i+1, n);
//         return n1;
//     }
//     public static int findpos(Node head, int target,int pos){
//         if(head==null){
//             return -1;
//         }
//         if(head.value==target){
//             return pos;
//         }
//         return findpos(head.next, target, pos+1);
//     }
//     public static void main(String[] args) {
//         Node temp=create(1, 5);
//        System.out.println(findpos(temp, 4, 0));
//     }
// }