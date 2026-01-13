import java.util.LinkedList;

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

    // public static void printList (Node head){
    //     Node curr = head;
    //     while(curr != null){
    //         System.out.print(curr.data + "->");
    //         curr = curr.next;
    //     }
    //     System.out.println("null");
    // }

    static Node reverse(Node head){
        Node prev = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next; 

        }
        return prev;
    }

    static boolean ispalindromic(LinkedList<Integer> list){
        Node fast = head, slow = head;


        while(fast != null && fast.next != null){  // even 
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null){   // odd length
            slow = slow.next;
        }

        slow =  reverse(slow);
        fast = head ;

        while(slow!=null && fast != null){
            if(slow.data != fast.data){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;

    }

    public static void  main(String args[]){
        // Node head1 = new Node(1);
        // head1.next = new Node(3);
        // head1.next.next = new Node(5);


        // Node head2 = new Node(2);
        // head2.next = new Node(4);
        // head2.next.next = new Node(6);

        // Node mergeList = merge(head1, head2);
        // printList(mergeList);


        // Problem 2 intersection of the two linked list

        // List<Integer> list1 = new LinkedList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);

        // List<Integer> list2 = new LinkedList<>();
        // list2.add(5);
        // list2.add(3);
        // list2.add(6);

        // Integer intersectionValue = null;

        // for (Integer value : list1) {
        //     if (list2.contains(value)) {
        //         intersectionValue = value; // only returns 3
        //         break;
        //     }
        // }

        // System.out.println(intersectionValue);



        // Palindrome Linked List 
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);






    }
}

