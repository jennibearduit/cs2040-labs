public class AvlChallenge {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOperations = io.getInt();
        Avl avlTree = new Avl();

        for (int i = 0; i < numOperations; i++) {
            char operation = io.getWord().charAt(0);
            if (operation == 'I') {
                avlTree.insert(io.getInt());
            } else if (operation == 'P') {
                io.println(avlTree.predecessor(io.getInt()));
            } else if (operation == 'S') {
                io.println(avlTree.successor(io.getInt()));
            } else if (operation == 'R') {
                io.println(avlTree.rank(io.getInt()));
            } 
        }
        
        avlTree.inorder(io);
        io.flush();
    }
}