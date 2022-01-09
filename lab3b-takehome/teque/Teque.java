public class Teque {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int n = io.getInt();
        TequeADT teque = new TequeADT(n);
        
        for (int i = 0; i < n; i++) {
            String instruction = io.getWord();
            int number = io.getInt();
            if (instruction.equals("push_back")) {                 // Push Back
                teque.pushBack(number);
            } else if (instruction.equals("push_front")) {          // Push Front
                teque.pushFront(number);
            } else if (instruction.equals("push_middle")) {          // Push Middle
                teque.pushMiddle(number);
            } else if (instruction.equals("get")) {
                io.println(teque.get(number));
            }
        }
        io.flush();
    }
}
