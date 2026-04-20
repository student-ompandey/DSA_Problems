class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class PartitionList {

    public static ListNode partition (ListNode head, int x){
        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode small = smallerHead;
        ListNode great = greaterHead;

        while (head != null){
            if(head.val < x){
                small.next = head;
                small = small.next;
            } else {
                great.next = head;
                great = great.next;
            }

            head = head.next;
        }

        great.next = null;

        small.next = greaterHead.next;

        return smallerHead.next;
    }
    // print the linkedlist

    public static void printList(ListNode head){
        while(head != null ){
            System.out.print(head.val + "-> ");
            head = head.next;
        }
        System.out.println("null");
    }


    public static void main (String [] args){
        // Example: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

            int x = 3;
            head = partition(head, x);
            printList(head);
    }
}
