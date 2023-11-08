package bst;

public class Ejercicios {
    
    private boolean isSimilar;

    public Ejercicios() {
        this.isSimilar = true;
    }
    
    public void Ejercicio2() {
        int size = 10;
        int[][] matrix = new int[size][size];
        int cont = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = cont;
                cont++;
            } 
        }
        BST bst = new BST();
        int contPrevious = (cont/2) -1;
        int contNext = (cont/2) +1;
        
        System.out.println("Pr"+contPrevious);
        System.out.println("Ne"+contNext);
        System.out.println("cont"+cont);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" "+matrix[i][j]+" ");
            } 
            System.out.println("");
        }
        while (contPrevious >= 0 && contNext <= 99) {
            bst.insertNodo(matrix[getI(contPrevious,size)][getJ(contPrevious,size)]);
            bst.insertNodo(matrix[getI(contNext,size)][getJ(contNext,size)]);
            contPrevious--;
            contNext++;
        }
        bst.preOrden(bst.getRoot());
    }
    
    private int getI(int number, int size) {
        return number / size;
    }
    
    private int getJ(int number, int size) {
        return number % size;
    }
    
    public boolean Ejercicio3(BST tree1, BST tree2) {
        this.isSimilar = true;
        if ((tree1.isEmpty() && !tree2.isEmpty()) || 
                (!tree1.isEmpty() && tree2.isEmpty())) {
            return false;
        }
        isSimilar(tree1.getRoot(), tree2.getRoot());
        return isSimilar;
    }
    
    public void isSimilar(Nodo pointer1,Nodo pointer2){
        
        if (pointer1 == null || pointer2 == null) {
            return;
        }
        
        if((pointer1.getLeftSon() != null && pointer2.getLeftSon() == null) ||
            pointer1.getLeftSon() == null && pointer2.getLeftSon() != null) {
                this.isSimilar = false;
        } else if ((pointer1.getRightSon() != null && pointer2.getRightSon() == null) ||
                    pointer1.getRightSon() == null && pointer2.getRightSon() != null) {
            this.isSimilar = false;
        }
        else {
            isSimilar(pointer1.getLeftSon(), pointer2.getLeftSon());
            isSimilar(pointer1.getRightSon(), pointer2.getRightSon());
        }
    }
}
