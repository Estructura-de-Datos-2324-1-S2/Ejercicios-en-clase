package bst;


public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        /*
        tree.insertNodoRecursive(55, tree.getRoot());
        tree.insertNodoRecursive(32, tree.getRoot());
        tree.insertNodoRecursive(10, tree.getRoot());
        tree.insertNodoRecursive(15, tree.getRoot());
        tree.insertNodoRecursive(18, tree.getRoot());
        tree.insertNodoRecursive(16, tree.getRoot());
        tree.insertNodoRecursive(100, tree.getRoot());
        tree.insertNodoRecursive(42, tree.getRoot());
        tree.insertNodoRecursive(17, tree.getRoot());
        tree.insertNodoRecursive(51, tree.getRoot());
        tree.insertNodoRecursive(21, tree.getRoot());
        tree.insertNodoRecursive(9, tree.getRoot());
        tree.insertNodoRecursive(5, tree.getRoot());*/
        
        tree.insertNodo(55);
        tree.insertNodo(32);
        tree.insertNodo(10);
        tree.insertNodo(15);
        tree.insertNodo(18);
        tree.insertNodo(16);
        tree.insertNodo(100);
        tree.insertNodo(35);
        System.out.println("");
        System.out.println("*** PREORDEN ***");
        tree.preOrden(tree.getRoot());
        /*
        System.out.println("");
        System.out.println("*** INORDEN ***");
        tree.inOrden(tree.getRoot());
        
        System.out.println("");
        System.out.println("*** POSTORDEN ***");
        tree.postOrden(tree.getRoot());
        */
        tree.deleteNodo(32, tree.getRoot(), null);
        System.out.println("");
        System.out.println("*** AFTER DELETE ***");
        tree.preOrden(tree.getRoot());
        tree.deleteNodo(55, tree.getRoot(), null);
        System.out.println("");
        System.out.println("*** AFTER DELETE 2***");
        tree.preOrden(tree.getRoot());
    }
    
}
