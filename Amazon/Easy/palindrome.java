import java.util.LinkedList;

public class palindrome {

    static boolean isPalindromic(LinkedList<Integer> list){
        int left = 0, right = list.size()-1;
        while(left<right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main (String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(isPalindromic(list));
    }
}
