package listascirculares;

public class ListaCircular implements ILista{
    private Nodo head;
    private int size;

    public ListaCircular() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void insertBegin(Object element) {
        Nodo nodo = new Nodo(element);
        if(isEmpty()) {
            setHead(nodo);
            getHead().setNext(getHead());
        } else {
            Nodo pointer = getHead();
            nodo.setNext(pointer);
            while(pointer.getNext() != getHead()) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
            setHead(nodo);
        }
        size++;
    }

    @Override
    public void insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            getHead().setNext(getHead());
        } else {
            Nodo pointer = getHead();
            nodo.setNext(pointer);
            while(pointer.getNext() != getHead()) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        size++;
    }

    @Override
    public void insertAtIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty() || index == 0){
            insertBegin(element);
        } else {
            if (index < getSize()) {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < index - 1) {
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                nodo.setNext(temp);
                pointer.setNext(nodo);
                size++;
            } else if (index == getSize()) {
                insertFinal(element);
            } else {
                System.out.println("Index not valid");
            }
        }
       
    }

    @Override
    public Nodo deleteBegin() {
        if (isEmpty()){
            System.out.println("La Lista esta vacia");
        } else {
            Nodo pointer = getHead();
            Nodo pointer2 = getHead();
            while (pointer.getNext() != getHead()) {
                pointer = pointer.getNext();
            }
            pointer.setNext(pointer2.getNext());
            pointer2.setNext(null);
            setHead(pointer.getNext());
            size--;
            return pointer2;
        }
        return null;
    }

    @Override
    public Nodo deleteFinal() {
        if (isEmpty()) {
            System.out.println("la Lista esta vacia");
        } else {
            if (getSize() == 1) {
                return deleteBegin();
            } else {
                Nodo pointer = getHead();
                while (pointer.getNext().getNext() != getHead()){
                    pointer = pointer.getNext();
                }
                Nodo pointer2 = pointer.getNext();
                pointer.setNext(getHead());
                pointer2.setNext(null);
                size--;
                return pointer2;
            }
        }
        return null;
    }

    @Override
    public Nodo deleteAtIndex(int index) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            if (index == 0){
            return deleteBegin();
            } else {
                if (index < getSize()) {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < index - 1) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    size--;
                    return temp;
                } else if (index == getSize()) {
                    return deleteFinal();
                } else {
                    System.out.println("Index not valid");
                    return null;
                }
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        boolean firstTime = true;
        while (pointer != getHead() || (firstTime && pointer != null)) {
            firstTime = false;
            System.out.print(" [ " + pointer.getElement() + " ] ");
            pointer = pointer.getNext();
        }
    }
    
    
    
    
}
