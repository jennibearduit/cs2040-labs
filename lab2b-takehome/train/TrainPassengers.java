import java.util.Scanner;
public class TrainPassengers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inTrain = 0;
        int capacity = sc.nextInt();
        int stations = sc.nextInt();
        boolean isPossible = true;

        for (int i = 0; i < stations; i++) {
            sc.nextLine();
            int leaveStation = sc.nextInt();
            int enterStation = sc.nextInt();
            int stayStation = sc.nextInt();

            inTrain += enterStation;
            inTrain -= leaveStation;

            if (inTrain > capacity || (stayStation > 0 && inTrain < capacity) || inTrain < 0) {
                isPossible = false;
            }

            if (i == 0 && leaveStation != 0) {
                isPossible = false;
            } else if (i == stations - 1 && (enterStation != 0 || stayStation != 0 || inTrain != 0)) {
                isPossible = false;
            }
        }
        if (isPossible == true) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
