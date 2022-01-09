import java.util.TreeMap;
import java.util.SortedMap;

class RainbowCats {
    public static void main(String[] args) {
        TreeMap<Index, Character> tm = new TreeMap<>();
        Kattio io = new Kattio(System.in, System.out);
        int n = io.getInt();
        int q = io.getInt();
        tm.put(0,'R');

        for (int i = 0; i < q; i++) {
            int operation = io.getInt();

            if (operation == 1) { // change colour
                int start = io.getInt();
                int end =  io.getInt();
                char colour = io.getWord().charAt(0);
                char lastColour = tm.floorEntry(end+1).getValue();

                SortedMap<Integer, Integer> sm = tm.subMap(start, end+1);
                sm.clear();
                if (end < n - 1) {
                    tm.put(end + 1, lastColour); 
                }
                tm.put(start, colour);

            } if (operation == 2) { // query
                int index = io.getInt();
                char colour = tm.floorEntry(index).getValue();
                io.println(colour);
            }
        }
        io.flush();

    }
}