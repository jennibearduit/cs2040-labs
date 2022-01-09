class Vertex {
    public Vertex parent, left, right;
    public int key;
    public int height; 
    public int size; 
    Vertex(int v) { key = v; height = -1; } // Vertex Constructor
} 

public class Avl {
    public Vertex root;
    
    public Avl() { root = null; }       // AVLADT Constructor

    public int size(Vertex T) {         // handles null cases
        if (T == null) return 0;
        return T.size;
    }

    public int height(Vertex T) {       // handles null cases
        if (T == null) return -1;
        return T.height;
    }

    // public method called to search for a value v. 
    // Return v if it is found in the AVL otherwise return -1.
    // Here the assumption is that -1 is never a valid key value.
    public int search(int v) {
        Vertex res = search(root, v);
        return res == null ? -1 : res.key;
    }

    // helper method to perform search
    public Vertex search(Vertex T, int v) {
        if (T == null)          return null;                        // not found
        else if (T.key == v)    return T;                           // found
        else if (T.key < v)     return search(T.right, v);          // search to the right
        else return search(T.left, v);                              // search to the left
    }

    // public method called to find Minimum key value in AVL
    public int findMin() { return findMin(root); }

    // helper method to perform findMin
    public int findMin(Vertex T) {
        if (T.left == null) return T.key;                       // this is the min
        else                return findMin(T.left);             // go to the left
    }

    // public method called to find Maximum key value in AVL
    public int findMax() { return findMax(root); }

    // helper method to perform findMax
    public int findMax(Vertex T) {
        if (T.right == null) return T.key;                      // this is the max
        else                 return findMax(T.right);           // go to the right
    }

    public int successor(int v) { 
        Vertex vPos = search(root, v);
        return vPos == null ? -1 : successor(vPos);
    }

    public int successor(Vertex T) {
        if (T.right != null)                                    // this subtree has right subtree
          return findMin(T.right);                              // the successor is the minimum of right subtree
        else {
          Vertex par = T.parent;
          Vertex cur = T;
          // if par(ent) is not root and cur(rent) is its right children
          while ((par != null) && (cur == par.right)) {
            cur = par;                                          // continue moving up
            par = cur.parent;
          }
          return par == null ? -1 : par.key;                    // this is the successor of T
        }
    }

    // public method to find predecessor to given value v in AVL
    public int predecessor(int v) { 
        Vertex vPos = search(root, v);
        return vPos == null ? -1 : predecessor(vPos);
    }

    // helper recursive method to find predecessor to for a given vertex T in AVL
    public int predecessor(Vertex T) {
        if (T.left != null)                                     // this subtree has left subtree
            return findMax(T.left);                             // the predecessor is the maximum of left subtree
        else {
            Vertex par = T.parent;
            Vertex cur = T;
            // if par(ent) is not root and cur(rent) is its left children
            while ((par != null) && (cur == par.left)) { 
                cur = par;                                      // continue moving up
                par = cur.parent;
            }
            return par == null ? -1 : par.key;                  // this is the successor of T
        }
    }

    // public method called to perform inorder traversal
    public void inorder(Kattio io) { 
        inorder(root, io);
        io.println();
    }

    // helper method to perform inorder traversal
    public void inorder(Vertex T, Kattio io) {
        if (T == null) return;
        inorder(T.left, io);                                    // recursively go to the left
        io.print(" " + T.key);                                  // visit this AVL node
        inorder(T.right, io);                                   // recursively go to the right
    }

    // public method called to perform inorder traversal
    public void preorder(Kattio io) { 
        preorder(root, io);
        io.println();
    }

    // helper method to perform inorder traversal
    public void preorder(Vertex T, Kattio io) {
        if (T == null) return;
        io.print(" " + T.key);                                  // visit this AVL node
        preorder(T.left, io);                                   // recursively go to the left
        preorder(T.right, io);                                  // recursively go to the right
    }

    // public method called to insert a new key with value v into AVL
    public void insert(int v) { 
        root = insert(root, v); 
    }
    
    // helper recursive method to perform insertion of new vertex into AVL
    public Vertex insert(Vertex T, int v) {
        if (T == null) return new Vertex(v);                    // insertion point is found
        if (T.key < v) {                                        // search to the right
            T.right = insert(T.right, v);
            T.right.parent = T;
        } else {                                                // search to the left
            T.left = insert(T.left, v);
            T.left.parent = T;
        }
 
        T.height = Math.max(height(T.left), height(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        return balance(T);                                      // return the updated AVL
    }  

    public int balanceFactor(Vertex T) {
        return height(T.left) - height(T.right);
    }  

    public Vertex balance(Vertex T) {
        if (balanceFactor(T) == 2) {
            if (balanceFactor(T.left) == -1) T.left = rotateLeft(T.left);
            T = rotateRight(T);
        } else if (balanceFactor(T) == -2) {
            if (balanceFactor(T.right) == 1) T.right = rotateRight(T.right);
            T = rotateLeft(T);
        } 
        return T;
    }

    public Vertex rotateLeft(Vertex T) {
        Vertex temp = T.right;
        temp.parent = T.parent;
        T.parent = temp;
        T.right = temp.left;

        if (temp.left != null) temp.left.parent = T;
        temp.left = T;

        T.height = Math.max(height(T.left), height(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;
        temp.size = size(T.left) + size(T.right) + 1;
        return temp;
    }

    public Vertex rotateRight(Vertex T) {
        Vertex temp = T.left;
        temp.parent = T.parent;
        T.parent = temp;
        T.left = temp.right;

        if (temp.right != null) temp.right.parent = T;
        temp.right = T;
        
        T.height = Math.max(height(T.left), height(T.right)) + 1;
        T.size = size(T.left) + size(T.right) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;
        temp.size = size(T.left) + size(T.right) + 1;
        return temp;
    }

        // helper method for rank
        public int rank(int value) {
            return rank(root,value);
        }
        
        public int rank(Vertex T, int value) {
            if (T.key == value) {
                return size(T.left) + 1;
            } else if (T.key > value) {
                return rank(T.left, value);
            } else {
                return size(T.left) + 1 + rank(T.right, value);
            }
        }
}