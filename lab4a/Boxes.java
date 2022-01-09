import java.util.HashSet;
import java.util.ArrayList;

public class Boxes {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int totalOperations = io.getInt();
        int row = io.getInt();
        int col = io.getInt();
        HashSet<Integer> box = new HashSet<>();
        HashSet<Integer> rowCheck = new HashSet<>();
        HashSet<Integer> colCheck = new HashSet<>();
        
        int r, c;
        
        for (int i = 0; i < totalOperations ; i++) {
            String instruction = io.getWord();
            if (instruction.equals("SIT")) {
                r = io.getInt();
                c = io.getInt();
                ArrayList temp = new ArrayList<>();
                temp.add(r);
                temp.add(c);
                box.add(temp);
                rowCheck.add(r);
                colCheck.add(c);

            } else if (instruction.equals("BOX")) {
                r = io.getInt();
                c = io.getInt();
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(r);
                temp.add(c);
                if (box.contains(temp)) {
                    io.println("Y");
                } else {
                    io.println("N");
                }
                
            } else if (instruction.equals("ROW")) {
                r = io.getInt();
                if (rowCheck.contains(r)) {
                    io.println("Y");
                } else {
                    io.println("N");
                }
            } else if (instruction.equals("COL")) {
                c = io.getInt();
                if (colCheck.contains(c)) {
                    io.println("Y");
                } else {
                    io.println("N");
                }
            }
        }
        io.flush();
    }
}
