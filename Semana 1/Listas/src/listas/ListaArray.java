
package listas;

public class ListaArray implements ILista {
    private Integer head;
    private int maxSize;
    private int size;
    private NodoArray[] array;

    public ListaArray(int maxSize) {
        this.head = null;
        this.maxSize = maxSize;
        this.size = 0;
        this.array = new NodoArray[0];
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    @Override
    public void insertBegin(Object element) {
        NodoArray nodo = new NodoArray(element);
        if (isEmpty()) {
            if(getArray().length == 0) {
                setArray(new NodoArray[1]);
                getArray()[0] = nodo;
                setHead(0);
                size++;
            }
        } else {
            if(getSize() == getMaxSize()) {
                System.out.println("El maximo tamaño ya fue alcanzado");
            } else {
                int position = searchSpace();
                if (position != -1) {
                    nodo.setNext(getHead());
                    getArray()[position] = nodo;
                    setHead(position);
                } else {
                    NodoArray[] newArray = new NodoArray[getSize() + 1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    nodo.setNext(getHead());
                    setHead(newArray.length - 1);
                    newArray[newArray.length - 1] = nodo;
                    setArray(newArray);
                    size++;
                }
            }
            
        }
    }
    
    private int searchSpace() {
        for (int i = 0; i < getArray().length; i++) {
            if(getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertFinal(Object element) {
        
    }

    @Override
    public void insertAtIndex(Object element, int index) {
        
    }

    @Override
    public NodoArray deleteBegin() {
        return null;
    }

    @Override
    public NodoArray deleteFinal() {
        return null;
    }

    @Override
    public NodoArray deleteAtIndex(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print() {
        Integer pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + getArray()[pointer].getElement() + " ] ");
            pointer = getArray()[pointer].getNext();
        }
    }
    
    public void printInMemory() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(" [ " + getArray()[i].getElement() + " ] ");
        }
        
    }
    
    
}
