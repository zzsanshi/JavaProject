package LinkListDemo2;

public class LinkList {
    int size;
    Node head;
    Node tail;
    public LinkList() {
        this.size = 0;
        head = new Node(0);
        tail = new Node(0);
        this.head.prev = tail;
        this.tail.next = head;
    }
    //插入节点
    public void addAtIndex(int index ,int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        Node pred = head, succ = tail;
        if (index < size - index) {
            pred = head;
            for(int i = 0; i < index; ++i) pred = pred.next;
            succ = pred.next;
        }
        else {
            succ = tail;
            for (int i = 0; i < size - index; ++i) succ = succ.prev;
            pred = succ.prev;
        }
        size++;
        Node toAdd = new Node(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
    }
    //删除节点
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return ;
        }
        Node pred, succ;
            pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            succ=pred.next.next;
        --size;
        pred.next = succ;
        succ.prev = pred;
        String s="11";
        s.toCharArray();
    }

}
