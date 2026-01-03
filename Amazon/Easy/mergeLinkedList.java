public class mergeLinkedList {
     static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node merge(Node head1, Node head2) {
            if (head1==null) return head2;
            if (head2==null) return head1;

            Node ans = head1;
            while(head1 != null && head2 !=null){
                Node temp = head1;
                while(head1!= null && head1.data <= head2.data){
                    temp = head1;
                    head1 = head1.next;
                }
                temp.next = head2;
                //swap 
                Node t = head1;
                head1 = head2;
                head2 = t ;


            }
            return ans;
    }

    public static void printList (Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void  main(String args[]){
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);


        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergeList = merge(head1, head2);
        printList(mergeList);
    }
}

