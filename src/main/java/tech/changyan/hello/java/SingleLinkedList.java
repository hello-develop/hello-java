package tech.changyan.hello.java;

public class SingleLinkedList {
    private ListNode head; //头节点
    private ListNode tail; //尾节点

    public ListNode getTail() {
        return tail;
    }

    public void setTail(ListNode tail) {
        this.tail = tail;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void addNode(ListNode node){
        if(this.head==null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }

    }

    public void printList(){
        ListNode ln = this.head;
        while(ln!=null){
            System.out.println(ln.val);
            ln = ln.next;
        }
    }

}
