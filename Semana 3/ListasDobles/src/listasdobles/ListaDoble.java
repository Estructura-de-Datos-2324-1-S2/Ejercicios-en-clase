/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobles;

/**
 *
 * @author Estudiante
 */
public class ListaDoble implements ILista{
    
    private Nodo head, tail;
    private int size;

    public ListaDoble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
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
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getHead().setPrevious(nodo);
            nodo.setNext(getHead());
            setHead(nodo);
        }
        size++;
    }

    @Override
    public void insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            nodo.setPrevious(getTail());
            setTail(nodo);
        }
        size++;
    }

    @Override
    public void insertAtIndex(Object element, int index) {
        if (isEmpty() || index ==0) {
            insertBegin(element);
        } else if (index < getSize()) {
            Nodo nodo = new Nodo(element);
            if (index <= size / 2) {
                Nodo pointerPrevious = getHead();
                int cont = 0;
                while (cont < index - 1) {
                    pointerPrevious = pointerPrevious.getNext();
                    cont++;
                }
                Nodo pointerNext = pointerPrevious.getNext();
                pointerPrevious.setNext(nodo);
                nodo.setPrevious(pointerPrevious);
                pointerNext.setPrevious(nodo);
                nodo.setNext(pointerNext); 
            } else {
                Nodo pointerNext = getTail();
                int cont = 0;
                while (cont < (getSize()-index-1)) {
                    pointerNext = pointerNext.getPrevious();
                    cont++;
                }
                // System.out.println("Values"+"Index"+index+"pointerNext"+pointerNext.getElement()+"Size"+getSize()+"cont"+cont);
                Nodo pointerPrevious = pointerNext.getPrevious();
                nodo.setPrevious(pointerPrevious);
                pointerPrevious.setNext(nodo);
                nodo.setNext(pointerNext);
                pointerNext.setPrevious(nodo);
            }   
            size++;
        } else if (index == getSize()) {
            insertFinal(element);
        } else {
            System.out.println("Invalid Index");
        }
    }

    @Override
    public Object deleteBegin() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            if (getHead() == getTail()) {
                setHead(null);
                setTail(null);
                size--;
            } else {
                Nodo pointer = getHead();
                setHead(pointer.getNext());
                getHead().setPrevious(null);
                pointer.setNext(null);
                size--;
                return pointer;
            }
        }
        return null;
    }

    @Override
    public Object deleteFinal() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            if (getTail() == getHead()) {
                setHead(null);
                setTail(null);
                size--;
            } else {
                Nodo pointer = getTail();
                setTail(pointer.getPrevious());
                getTail().setNext(null);
                pointer.setPrevious(null);
                size--;
                return pointer;
            }
        }
        return null;
    }

    @Override
    public Object deleteAtIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + pointer.getElement() + " ] ");
            pointer = pointer.getNext();
        }
    }
    
    
    
}
