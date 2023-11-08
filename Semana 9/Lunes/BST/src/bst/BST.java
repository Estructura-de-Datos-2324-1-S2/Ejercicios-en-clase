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
    
    public void deleteNodo(int element, Nodo pointer, Nodo previousNodo) {
        if (isEmpty()) {
            System.out.println("El arbol esta vacio");
        } else {
            if (element < pointer.getElement()) {
                deleteNodo(element, pointer.getLeftSon(), pointer);
            } else if (element > pointer.getElement()) {
                deleteNodo(element, pointer.getRightSon(), pointer);
            } else {
                if(pointer.isLeaf()) {
                    // Cuando es una hoja
                    if (previousNodo == null) {
                        setRoot(null);
                    } else {
                        if (element < previousNodo.getElement()) {
                            previousNodo.setLeftSon(null);
                        } else {
                            previousNodo.setRightSon(null);
                        }
                    }
                } else if(pointer.hasOnlyRigthSon()) {
                    // Cuando solo tiene un hijo derecho
                    previousNodo.setRightSon(pointer.getRightSon());
                    pointer.setRightSon(null);
                } else if (pointer.hasOnlyLeftSon()) {
                    // Cuando solo tiene un hijo izquierdo
                    previousNodo.setLeftSon(pointer.getLeftSon());
                    pointer.setLeftSon(null);
                } else {
                    // Cuando tiene dos hijos
                    boolean haveRigthSons = validateLeftSon(pointer.getLeftSon());
                    if (haveRigthSons) {
                        Nodo nodo = searchNodoToReplace(pointer.getLeftSon());
                        if (previousNodo == null) {
                            nodo.setLeftSon(pointer.getLeftSon());
                            nodo.setRightSon(pointer.getRightSon());
                            setRoot(nodo);
                        } else {
                            if (element < previousNodo.getElement()){
                                nodo.setLeftSon(pointer.getLeftSon());
                                nodo.setRightSon(pointer.getRightSon());
                                previousNodo.setLeftSon(nodo);
                            } else {
                                nodo.setLeftSon(pointer.getLeftSon());
                                nodo.setRightSon(pointer.getRightSon());
                                previousNodo.setRightSon(nodo);
                            }
                        }
                    } else {
                        Nodo nodo = pointer.getLeftSon();
                        if (element < previousNodo.getElement()){
                            nodo.setRightSon(pointer.getRightSon());
                            previousNodo.setLeftSon(nodo);
                        } else {
                            nodo.setRightSon(pointer.getRightSon());
                            previousNodo.setRightSon(nodo);
                        }
                    }
                }
            }
        }
    }
    
    public Nodo searchNodoToReplace(Nodo nodo) {
        Nodo previous = nodo;
        while (nodo.getRightSon() != null) {
            previous = nodo;
            nodo = nodo.getRightSon();
        } 
        previous.setRightSon(null);
        if (nodo.getLeftSon() != null) {
            previous.setRightSon(nodo.getLeftSon());
        }
        return nodo;
    }
    
    public boolean validateLeftSon(Nodo nodo) {
        return nodo.getRightSon() != null;
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
                return searchElement(key, pointer.getLeftSon());
            } else {
                return searchElement(key, pointer.getRightSon());
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
