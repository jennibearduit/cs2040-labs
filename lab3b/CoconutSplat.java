import java.util.ArrayDeque;
import java.util.Deque;

public class CoconutSplat {
    public static void main(String[] args) {

        Kattio io = new Kattio(System.in, System.out);
        int s = io.getInt();
        int n = io.getInt();

        Deque<Hand> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.offerLast(new Hand(i+1, 1));
        }

        while (n > 1) {
            int currHand = (s - 1) % n;

            for (int i = 0; i < currHand; i++) {    // place currHand in front
                deque.offerLast(deque.poll());
            }

            Hand temp = deque.pollFirst();
            
            if (temp.getState() == 3) {
                n--;
            } else if (temp.getState() == 2) {
                deque.offerLast(new Hand(temp.getPlayer(), 3));
            } else if (temp.getState() == 1) {
                deque.offerFirst(new Hand(temp.getPlayer(), 2));
                deque.offerFirst(new Hand(temp.getPlayer(), 2));
                n++;
            
                
        Hand temp = deque.pollFirst();
        io.println(temp.getPlayer());
        io.close();   
    }
}