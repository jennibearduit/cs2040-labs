import java.util.Scanner;
import java.util.Arrays;

public class SortOfSorting {
    public static void main(String[] args) {
        FirstLetterComparator firstLComp = new FirstLetterComparator();
        SecondLetterComparator secondLComp = new SecondLetterComparator();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] students = new String[200];

        do {       
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                students[i] = sc.nextLine();
            }

            Arrays.parallelSort(students, 0, n, secondLComp);
            Arrays.parallelSort(students, 0, n, firstLComp);

            for (int i = 0; i < n; i++) {
                System.out.println(students[i]);
            }
            
            System.out.println();
            n = sc.nextInt();
        } while (n > 0);
        
        sc.close();
    }
}