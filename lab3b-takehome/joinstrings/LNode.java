public class LNode {
    public int item;
    public int index;
    public LNode next;
    public String phrase; 

    public LNode(int item) {
        this.item = item;
    }

    public LNode(int item, LNode n) {
        this.item = item;
        next = n;
    }

    public int getItem() {
        return item;
    }
    
    public LNode getNext() {
        return next;
    }
}