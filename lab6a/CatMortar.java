import java.util.PriorityQueue;
import java.util.Scanner;

public class CatMortar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Point> points = new PriorityQueue<>();

        double startX = sc.nextDouble(); // start x-coordinate
        double startY = sc.nextDouble(); // start y-coordinate
        double goalX = sc.nextDouble(); // goal x-coordinate
        double goalY = sc.nextDouble(); // goal y-coordinate
        int mortars = sc.nextInt(); // number of mortars
        
        boolean[] visited = new boolean[mortars+2]; // visited points
        double[] x = new double[mortars+2]; // x-coordinate of points
        double[] y = new double[mortars+2]; // y-coordinate of points

        // mortar coordinates, index represent the point's ID
        for (int i = 1; i <= mortars; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        // destination coordinates
        x[mortars+1] = goalX;
        y[mortars+1] = goalY;

        Point start = new Point(0, 0, startX, startY);
        double time = start.timeTo(goalX, goalY); // if no mortars

        // Dijkstra Algorithm
        points.add(start); // initializing PQ
        while (!points.isEmpty()) {
            Point curr = points.poll(); // shortest time
            if (curr.x == goalX && curr.y == goalY) {
                time = curr.time;
                break;
            }
            visited[curr.id] = true;
            // ID: 0 is for start, 1 to mortars is for mortar, mortars+1 is for goal
            for (int i = 1; i < mortars + 2; i++) { 
                if (i == curr.id || visited[i]) continue;
                points.add(new Point(curr.time + curr.timeTo(x[i], y[i]), i, x[i], y[i]));
            }
        }

        System.out.println(time);
    }
}
