package cn.znvis.hello.java;

import org.junit.Test;

public class HelloAddTest {

    @Test
    public void addTwoNumbers() {

        // arg1
        SingleLinkedList sll1 = new SingleLinkedList();
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(1);
        sll1.addNode(ln1);
        sll1.addNode(ln2);
        sll1.addNode(ln3);

        // arg2
        SingleLinkedList sll2 = new SingleLinkedList();
        ListNode ln11 = new ListNode(6);
        ListNode ln12 = new ListNode(5);
//        ListNode ln13 = new ListNode(4);
        sll2.addNode(ln11);
        sll2.addNode(ln12);
//        sll2.addNode(ln13);

        sll1.printList();
        System.out.println();
        sll2.printList();
        System.out.println();
        HelloAdd ha = new HelloAdd();
        SingleLinkedList sll = ha.addTwoNumbers(sll1, sll2);
        sll.printList();
    }
}