import java.util.PriorityQueue;
import java.util.HashMap;

public class CatInfection {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int totalOperations = io.getInt();
        PriorityQueue<Cat> pq = new PriorityQueue<>(200000);
        HashMap<String, Cat> cats = new HashMap<>();
        String name;
        int input;
        Cat currCat;


        for (int i = 1; i <= totalOperations; i++) {
            int currOp = io.getInt();
            
            // ArriveAtClinic(catName, infectionLevel)
            if (currOp == 0) {
                name = io.getWord();
                input = io.getInt();
                currCat = new Cat(name, input, i);
                pq.offer(currCat);
                cats.put(name, currCat);
                

            // UpdateInfectionLevel(catName, increaseInfection)
            } else if (currOp == 1) {
                name = io.getWord();
                Cat temp =  cats.get(name);
                Cat cur = new Cat(temp.getName(), temp.getInfectionLevel(), temp.getIndex());
                cur.infectionLevel += io.getInt();
                pq.offer(cur);
                cats.put(name,cur);


            // Treated(catName)
            } else if (currOp == 2) {
                cats.remove(io.getWord());
        

            // Query()
            } else if (currOp == 3) {
                boolean empty = true;
                if (cats.isEmpty()) {
                    io.println("The clinic is empty");
                } else {
                    while (!pq.isEmpty() && empty != false) {
                        Cat temp = pq.peek();
                        if (cats.containsKey(temp.getName())) {
                            io.println(temp.getName());
                            empty = false;
                        } else {
                            pq.poll();
                        }
                    }
                    if (empty) io.println("The clinic is empty");
                }
            }
            
        }

        io.flush();
    }
}