package queue;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        Random rand = new Random(); 
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(rand.nextInt(100));
        }
        System.out.println("Cola original");
        queue.print();
        
        Ejercicios ej = new Ejercicios();
        ej.ejercicio3(queue);
        
    }
    
}
