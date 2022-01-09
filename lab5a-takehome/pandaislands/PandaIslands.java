import java.util.*;
public class PandaIslands {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numIslands = io.getInt();
        int numEdges = io.getInt();
        // visited[i] = 0 means unvisited
        // visited[i] = 1 means no neighbors, white
        // visited[i] = 2 means either black or white, and add neighbor of status 3
        // visited[i] = 3 means either white or black, and add neighbor of status 2
        int[] visited = new int[numIslands+1];
        int[] size = new int[numIslands+1];
        HashMap<Integer, ArrayDeque<Integer>> neighbours = new HashMap<>(); 
        Ufds ufds = new Ufds(numIslands);

        for (int i = 1; i <= numIslands; i++) {   
            size[i] = io.getInt();
        }
        for (int i = 1; i <= numEdges; i++) { 
            int island1 = io.getInt();
            int island2 = io.getInt();
            
            if (!neighbours.containsKey(island1)) {
                neighbours.put(island1, new ArrayDeque<>());
            }
            if (!neighbours.containsKey(island2)) {
                neighbours.put(island2, new ArrayDeque<>());
            }
            neighbours.get(island1).offer(island2);
            neighbours.get(island2).offer(island1);
            ufds.unionSet(island1, island2);
        }
        for (int i = 1; i <= numIslands; i++) {
            if (!neighbours.containsKey(i)) {
                visited[i] = 1;                 
            } else if (visited[i] == 0) {
                visited[i] = 2;                 
                ArrayDeque<Integer> temp = neighbours.get(i);
                while (!temp.isEmpty()) {
                    int neighbour = temp.poll();
                    if (visited[neighbour] == 0) {
                        visited[neighbour] = 3;
                    }
                }
            } 
        }
        HashMap<Integer, Integer> size2 = new HashMap<>();
        HashMap<Integer, Integer> size3 = new HashMap<>();
        for (int i = 1; i <= numIslands; i++) {
            int represent = ufds.findSet(i);
            if (visited[i] == 2) {
                if (!size2.containsKey(represent)) {
                    size2.put(represent, size[i]);
                } else {
                    size2.put(represent, size2.get(represent) + size[i]);
                }
            } else if (visited[i] == 3) {
                if (!size3.containsKey(represent)) {
                    size3.put(represent, size[i]);
                } else {
                    size3.put(represent, size3.get(represent) + size[i]);
                }
            }
        }
        int blackArea = 0;
        int currRep;
        
        Iterator<HashMap<Integer, Integer>> iter = size2.keySet().iterator();
        while (iter.hasNext()) {
            currRep = iter.next();
            blackArea += Math.min(size2.get(currRep), size3.get(currRep));
        }
        io.println(blackArea);
        io.flush();
    }
}