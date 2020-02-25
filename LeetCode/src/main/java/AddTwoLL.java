import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddTwoLL {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result;
        List<ListNode> resultList = new ArrayList();
        int carryover = 0;
        while(l1 != null && l2 != null){
            int tmp = l1.val + l2.val;
            if(tmp >= 10){
                String tmpStr = String.valueOf(tmp);
                result = new ListNode(Integer.parseInt(String.valueOf(tmpStr.charAt(1))));
                resultList.add(result);
                carryover = Integer.parseInt(String.valueOf(tmpStr.charAt(0)));
            }else{
                result = new ListNode(carryover + l1.val + l2.val);
                resultList.add(result);
                carryover=0;
            }
            l1 = l1.next; l2 = l2.next;
        }
        if(carryover != 0){
            result = new ListNode(carryover);
            resultList.add(result);
        }

        for (int i = 0; i < resultList.size(); i++) {
            if(i == resultList.size()-1){
                continue;
            }else{
                resultList.get(i).next = resultList.get(i+1);
            }
        }
        return resultList.get(0);
    }

    public static void main(String[] args) {

        ListNode firstNodel1 = new ListNode(2);
        ListNode secondNodel1 = new ListNode(4);
        ListNode thirdNodel1 = new ListNode(3);

        firstNodel1.next = secondNodel1;
        secondNodel1.next = thirdNodel1;

        ListNode firstNodel2 = new ListNode(5);
        ListNode secondNodel2 = new ListNode(6);
        ListNode thirdNodel2 = new ListNode(4);

        firstNodel2.next = secondNodel2;
        secondNodel2.next = thirdNodel2;

        ListNode resultNode = addTwoNumbers(firstNodel1, firstNodel2);

        System.out.println(resultNode.val +"->"+resultNode.next.val+"->"+resultNode.next.next.val);


    }
}
