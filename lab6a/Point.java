public class Point implements Comparable<Point> {
    double time;
    int id; // unique id for each point
    double x;
    double y;

    Point(double time, int id, double x, double y) {
        this.time = time;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.time < p.time) {
            return -1;
        } else if (this.time > p.time) {
            return 1;
        } else {
            if (this.id < p.id) {
                return -1;
            } else if (this.id > p.id) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public double timeTo(double x, double y) {
        if (this.id == 0) { // if this is starting point
            return this.distanceTo(x,y) / 5;
        }
        return 2 + Math.abs(this.distanceTo(x,y) - 50) / 5;
    }
    
    public double distanceTo(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}