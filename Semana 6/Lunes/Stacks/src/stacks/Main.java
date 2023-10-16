
package stacks;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.pop();
        stack.print();
        
        // Ejercicio 1
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(4);
        stack1.push(5);
        Stack stack2 = new Stack();
        stack2.push(5);
        stack2.push(3);
        stack2.push(5);
        
        Ejercicios ej = new Ejercicios();
        Stack stackResult = ej.ejercicio1(stack1, stack2);
        System.out.println("El resultado es: ");
        stackResult.print();
    }
    
}
