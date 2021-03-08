package linkedlist;

/**
 * @description: 单链表节点
 * @version: 1.0
 * @date: 2021-03-06 16:04:47
 * @author: wanglong16@meicai.cn
 */
public class SingleNode {

    public int val;

    public SingleNode next;

    public SingleNode(int val, SingleNode next) {
        this.val = val;
        this.next = next;
    }

    public SingleNode(int val) {
        this.val = val;
    }

    public SingleNode() {
    }
}
