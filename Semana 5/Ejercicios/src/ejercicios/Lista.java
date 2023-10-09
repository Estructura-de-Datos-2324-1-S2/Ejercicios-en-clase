/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Estudiante
 */
public class Lista implements ILista {
    
    private Nodo head;
    private int length;

    public Lista() {
        this.head = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void insertBegin(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()){
            setHead(nodo);
        } else {
            nodo.setNext(getHead());
            setHead(nodo);
        }
        length++;
    }
    
    public void insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()){
            setHead(nodo);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        length++;
    }
    
    
    
    public void insertAtIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty() || index == 0){
            insertBegin(element);
        } else {
            if (index < getLength()) {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < index - 1) {
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                nodo.setNext(temp);
                pointer.setNext(nodo);
                length++;
            } else if (index == getLength()) {
                insertFinal(element);
            } else {
                System.out.println("Index not valid");
            }
        }
    }
    
    public Nodo deleteBegin() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    }
    
    public Nodo deleteFinal() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            Nodo temp = pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }
    
    
    public Nodo deleteAtIndex(int index) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            if (index == 0){
            return deleteBegin();
            } else {
                if (index < getLength()) {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < index - 1) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                    return temp;
                } else if (index == getLength()) {
                    return deleteFinal();
                } else {
                    System.out.println("Index not valid");
                    return null;
                }
            }
        }
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + pointer.getElement() + " ] ");
            pointer = pointer.getNext();
        }
    }
}
