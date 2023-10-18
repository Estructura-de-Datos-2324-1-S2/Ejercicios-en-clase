package queue;


public interface IQueue {
    public void enqueue(Object element);
    public Nodo dequeue();
    public Object process();
    public Nodo dispatch();
}
