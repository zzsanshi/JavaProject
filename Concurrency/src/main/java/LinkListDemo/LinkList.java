package LinkListDemo;

public class LinkList {
    Node head;//头节点
    int size;

    public LinkList() {
        this.head = new Node(0);
        this.size = 0;
    }

    //插入元素
    public void addAtIndex(int index, int val) {
        if(index > size) {
            return ;
        }
        if(index < 0) {
            index = 0;
        }
        size++;
        Node pre = head;
        for (int i = 0; i <index; i++) {
            pre=pre.next;
        }
        Node addNode = new Node(val);
        addNode.next = pre.next;
        pre.next = addNode;
    }
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    //获取元素
    public int get(int index) {
        if( index >= size || index < 0) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i <index+1; i++) {
            curr = curr.next;
        }
        return curr.data;
    }
    //删除元素
     public void deleteAtIndex(int index) {
        if (index<0 || index >= size){
            return;
        }
        size--;
        Node pre = head;
         for (int i = 0; i < index; i++) {
            pre = pre.next;
         }
         pre.next=pre.next.next;
     }
}
