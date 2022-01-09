import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        int ascii;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            boolean[] alphabets = new boolean[26];
            String phrase = sc.nextLine().toLowerCase();
            boolean missing = false;

            for (int j = 0; j < phrase.length(); j++) {
                ascii = (int) phrase.charAt(j);
                if (ascii > 96 && ascii < 123) {
                    alphabets[ascii - 97] = true;
                }
            }

            for (int j = 0; j < 26; j++) {
                if (!alphabets[j]) {
                    ascii = 97 + j;
                    if (!missing) {
                        System.out.print("missing " + ((char) ascii));
                        missing = true;
                    } else {
                        System.out.print(((char) ascii));
                    }
                }
                if (j == 25 && missing) {
                    System.out.println();
                }
            }

            if (!missing) {
                System.out.println("pangram");
            }
        }
    }
    
}
