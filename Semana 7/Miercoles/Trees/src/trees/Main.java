/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.printPreOrden(tree.getRoot());
        tree.insertNodo(55, -1, null);
        tree.insertNodo(32, 55, tree.getRoot());
        tree.insertNodo(10, 55, tree.getRoot());
        tree.insertNodo(15, 55, tree.getRoot());
        tree.insertNodo(18, 10, tree.getRoot());
        tree.insertNodo(16, 10, tree.getRoot());
        tree.insertNodo(100, 10, tree.getRoot());
        tree.insertNodo(42, 10, tree.getRoot());
        tree.insertNodo(17, 16, tree.getRoot());
        tree.insertNodo(51, 16, tree.getRoot());
        tree.insertNodo(21, 16, tree.getRoot());
        tree.insertNodo(9, 15, tree.getRoot());
        tree.insertNodo(5, 15, tree.getRoot());
        
        tree.printPreOrden(tree.getRoot());
    }
    
}
