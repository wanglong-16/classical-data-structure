package linkedlist;

/**
 * @description: 单链表节点
 * @version: 1.0
 * @date: 2021-03-06 16:07:44
 * @author: wanglong16@meicai.cn
 */
public class DoubleNode {

    public int val;

    public DoubleNode next;

    public DoubleNode prev;

    public DoubleNode(int val, DoubleNode next, DoubleNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public DoubleNode(int val) {
        this.val = val;
    }

    public DoubleNode() {
    }
}
