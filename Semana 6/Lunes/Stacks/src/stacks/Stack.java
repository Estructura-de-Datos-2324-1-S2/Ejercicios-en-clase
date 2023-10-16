
package stacks;

public class Stack implements IStacks {
    
    private Nodo peak;
    private int length;

    public Stack() {
        this.peak = null;
        this.length = 0;
    }

    public Nodo getPeak() {
        return peak;
    }

    public void setPeak(Nodo peak) {
        this.peak = peak;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void push(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setPeak(nodo);
        } else {
            nodo.setNext(getPeak());
            setPeak(nodo);
        }
        length++;
    }

    @Override
    public Nodo pop() {
        if (isEmpty()) {
            System.out.println("La lista se encuentra vacia");
            return null;
        } else {
            Nodo pointer = getPeak();
            setPeak(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
    }

    @Override
    public boolean isEmpty() {
        return getPeak() == null;
    }
    
    public void print(){
        Nodo pointer = getPeak();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement() + " ]");
            pointer = pointer.getNext();
        } 
    }
    
}
