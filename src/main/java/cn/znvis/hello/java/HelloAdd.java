package cn.znvis.hello.java;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class HelloAdd {
    public SingleLinkedList addTwoNumbers(SingleLinkedList sll1, SingleLinkedList sll2) {

        int num1 = this.sumList(sll1);
        int num2 = this.sumList(sll2);

        int num = num1 + num2;

        return this.implodeList(num);
    }

    private int sumList(SingleLinkedList sll){
        ListNode ln = sll.getHead();
        int num = 0;
        int count = 0;
        while(ln!=null){
            num += ln.val * Math.pow(10, count++);
            ln = ln.next;
        }

        return num;
    }

    private SingleLinkedList implodeList(int num){
        String numStr = String.valueOf(num);
        SingleLinkedList sll = new SingleLinkedList();
        for(int i=numStr.length()-1; i>=0; i--){
            int val = numStr.charAt(i) - '0';
            sll.addNode(new ListNode(val));
        }

        return sll;
    }
}
