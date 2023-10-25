package trees;

public class Tree {
    private Nodo root;

    public Tree() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void insertNodo(int element, int fatherElement, Nodo pointer) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()){
            setRoot(nodo);
        } else {
            if (pointer.getElement() == fatherElement) {
                increaseSons(nodo, pointer);
                return;
            } else {
                for (int i = 0; i < pointer.getSons().length; i++) {
                    insertNodo(element,fatherElement,pointer.getSons()[i]);
                }
            }
        }
    }
    
    public void increaseSons(Nodo nodo, Nodo father){
        Nodo[] newSons = new Nodo[father.getSons().length + 1];
        for (int i = 0; i < father.getSons().length; i++) {
            newSons[i] = father.getSons()[i];
        }
        newSons[newSons.length - 1] = nodo;
        father.setSons(newSons);
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
   
    public void printPreOrden(Nodo pointer) {
        if (isEmpty()) {
            System.out.println("El arbol esta vacio");
        } else {
            System.out.println("[ " + pointer.getElement() + " ]");
            for (int i = 0; i < pointer.getSons().length; i++) {
                printPreOrden(pointer.getSons()[i]);
            }
        }
        

    }
    
    
}
