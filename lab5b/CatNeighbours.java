import java.util.HashSet;
import java.util.ArrayList;

class CatNeighbours {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int height = io.getInt();
        int width = io.getInt();
        int numCats = io.getInt();
        int[][] catMap = new int[height][width];
        ArrayList<Integer> neighbours = new ArrayList<>(numCats); 
       
        for (int n = 0; n < numCats; n++) {
            neighbours.add(new HashSet<>(numCats-1));
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                catMap[i][j] = io.getInt();
                int currCat = catMap[i][j];
                
                if (i > 0) {
                    int topCat = catMap[i-1][j];
                    if (currCat != topCat) {
                        neighbours.get(topCat).add(currCat);
                        neighbours.get(currCat).add(topCat);
                    }
                }
                if (j > 0) {
                    int leftCat = catMap[i][j-1];
                    if (currCat != leftCat) {
                        neighbours.get(leftCat).add(currCat);
                        neighbours.get(currCat).add(leftCat);
                    }
                }
            }
        }

        for (int n = 0; n < numCats; n++) {
            io.println(neighbours.get(n).size());
        }
        
        io.flush();
    }
}