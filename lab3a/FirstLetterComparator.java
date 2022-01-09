import java.util.Comparator;

class FirstLetterComparator implements Comparator<String> {
    
    public int compare(String s1, String s2) {
        int ascii1 = (int) s1.charAt(0);
        int ascii2 = (int) s2.charAt(0);
        return ascii1 - ascii2;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }
}

