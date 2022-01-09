public class TequeADT {
    int frontHead = 0;
    int frontTail = -1;
    int backHead = 0;
    int backTail = -1;
    int frontSize = 0;
    int backSize = 0;
    int arraySize;
    int[] front;
    int[] back;
    public TequeADT(int size) {
        this.front = new int[size/2 + 1];
        this.back = new int[size/2 + 1];
        this.arraySize = size/2 + 1;
    }
    public void pushBack(int number) {
        backSize++;
        backTail++;
        if (backSize == 1) {
            backHead = backTail;
        }
        back[backTail] = number;
        balance();
    }
    public void pushFront(int number) {
        frontSize++;
        frontHead = (frontHead - 1 + arraySize) % arraySize;
        if (frontSize == 1) {
            frontTail = frontHead;
        }
        front[frontHead] = number;
        balance();
    }
    public void pushMiddle(int number) {
        if (backSize < frontSize) {
            backSize++;
            backHead = (backHead - 1 + arraySize) % arraySize;
            back[backHead] = number;
        } else {
            frontSize++;
            frontTail = (frontTail + 1) % arraySize;
            front[frontTail] = number;
        }
    }
    public int get(int index) {
        if (index < frontSize) {
            return front[(frontHead + index) % arraySize];
        } else {
            index -= frontSize; 
            return back[(backHead + index) % arraySize];
        }
    }
    public void balance() {
        if (backSize > frontSize) {
            int number = back[backHead];
            backSize--;
            backHead = (backHead + 1) % arraySize;
            pushMiddle(number);
        } else if (frontSize > backSize + 1) {
            int number = front[frontTail];
            frontSize--;
            frontTail--;
            pushMiddle(number);
        }
    }
}
