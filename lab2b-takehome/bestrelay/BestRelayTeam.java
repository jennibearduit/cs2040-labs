import java.util.*;

public class BestRelayTeam {
    public static void main(String[] args) {
        FirstLegComparator firstLComp = new FirstLegComparator();
        NextLegComparator nextLComp = new NextLegComparator();
        Scanner sc = new Scanner(System.in);

        int totalRunners = sc.nextInt();
        sc.nextLine();

        Runner[] firstRunner = new Runner[totalRunners];
        Runner[] nextRunner = new Runner[totalRunners];

        for (int i = 0; i < totalRunners; i++) {
            firstRunner[i] = new Runner(sc.next(), sc.nextDouble(), sc.nextDouble());
            nextRunner[i] = firstRunner[i];
            sc.nextLine();
        }

        Arrays.sort(firstRunner, firstLComp);
        Arrays.sort(nextRunner, nextLComp);

        double minTime = 0;
        int fLegIndex = 0;
        for (int i = 0; i < 4; i++) {
            int j = 0;
            int members = 1;
            double currTime = firstRunner[i].getFirstLegTime();

            while (members < 4 && j < 4) {
                if (firstRunner[i] != nextRunner[j]) {
                    currTime += nextRunner[j].getNextLegTime();
                    members++;
                }
                j++;
            }
            if (i == 0) {
                minTime = currTime;
            } else if (minTime > currTime) {
                minTime = currTime;
                fLegIndex = i;
            }
        }

        System.out.println(minTime);
        System.out.println(firstRunner[fLegIndex].toString());
        
        int members = 1;
        int j = 0;
        while (members < 4 && j < 4) {
            if (firstRunner[fLegIndex] != nextRunner[j]) {
                System.out.println(nextRunner[j].toString());
                members++;
            }
            j++;
        }
    }
}