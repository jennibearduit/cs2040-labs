class TailedLL {
    public LNode head;
    public LNode tail;
    public int num_nodes;

    public TailedLL(LNode head) {
        this.head = head;
        this.tail = head;
        this.num_nodes = 1;
    }

    public LNode getHead() {
        return head;
    }

    public LNode getTail() {
        return tail;
    }
    
    public void addBack(TailedLL item) {
        LNode head = item.getHead();
        LNode tail = item.getTail();
        this.tail.next = head;
        this.tail = tail;
    }
}