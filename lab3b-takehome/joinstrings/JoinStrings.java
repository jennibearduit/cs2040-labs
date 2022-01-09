public class JoinStrings {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int n = io.getInt();
        TailedLL[] index = new TailedLL[n+1];
        String[] phrase = new String[n+1];

        for (int i = 1; i <= n; i++) {
            phrase[i] = io.getWord();
        }

        for (int i = 1; i <= n; i++) {
            index[i] = new TailedLL(new LNode(i));
        }

        int append = 1;
        for (int i = 1; i <= n - 1; i++) {
            append = io.getInt();
            int delete = io.getInt();
            index[append].addBack(index[delete]);
        }

        LNode currNode = index[append].getHead();
        for (int i = 1; i <= n; i++) {
            io.print(phrase[currNode.getItem()]);
            currNode = currNode.getNext();
        }
        
        io.println();
        io.flush();
    }
}