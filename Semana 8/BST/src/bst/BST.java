package bst;

public class BST {
    private Nodo root;

    public BST() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    private boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void insertNodoRecursive(int element, Nodo pointer) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            if (element < pointer.getElement()) {
                if (pointer.getLeftSon() == null) {
                    pointer.setLeftSon(nodo);
                } else  {
                    insertNodoRecursive(element, pointer.getLeftSon());
                }
            } else {
                if (pointer.getRightSon() == null) {
                    pointer.setRightSon(nodo);
                } else {
                    insertNodoRecursive(element, pointer.getRightSon());
                }
            }
        }
    }
    
    public void insertNodo(int element){
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            Nodo pointer = getRoot();
            while (true) {
                if (element < pointer.getElement()) {
                    if (pointer.getLeftSon() == null) {
                        pointer.setLeftSon(nodo);
                        break;
                    } else  {
                        pointer = pointer.getLeftSon();
                    }
                } else {
                    if (pointer.getRightSon() == null) {
                        pointer.setRightSon(nodo);
                        break;
                    } else {
                        pointer = pointer.getRightSon();
                    }
                }
            }
        }
    } 
    
    public Integer searchElement(int key, Nodo pointer) {
        if (isEmpty()) {
            System.out.println("No hay elementos en el arbol");
            return null;
        } else {
            if (pointer.getElement() == key) {
                return pointer.getElement();
            } else if (pointer == null) {
                return null;
            } 
            
            // Por si les gusta
            // searchElement(key, (key < pointer.getElement()) ? pointer.getLeftSon() : pointer.getRightSon());
            
            if (key < pointer.getElement()) {
                searchElement(key, pointer.getLeftSon());
            } else {
                searchElement(key, pointer.getRightSon());
            }
        }
    }
    
    public void preOrden(Nodo pointer) {
        if (pointer != null) {
            System.out.println("[ "+ pointer.getElement() + " ]");
            preOrden(pointer.getLeftSon());
            preOrden(pointer.getRightSon());
        }
    }
    
    public void inOrden(Nodo pointer) {
        if (pointer != null) {
            preOrden(pointer.getLeftSon());
            System.out.println("[ "+ pointer.getElement() + " ]");
            preOrden(pointer.getRightSon());
        }
    }
    
    public void postOrden(Nodo pointer) {
        if (pointer != null) {
            preOrden(pointer.getLeftSon());
            preOrden(pointer.getRightSon());
            System.out.println("[ "+ pointer.getElement() + " ]");
        }
    }
}
