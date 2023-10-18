/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;



public class Ejercicios {

    public Ejercicios() {
    }
    
    
    
    public void ejercicio3(Queue queue) {
        Nodo pointer = queue.getHead();
        Integer min= null;
        Integer max= null;
        while(pointer != null) {
            if (min == null) {
                min = (int)pointer.getElement();
            } else if((int)pointer.getElement() < min){
                min = (int)pointer.getElement();
            }
            if (max == null) {
                max = (int)pointer.getElement();
            } else if((int)pointer.getElement() > max){
                max = (int)pointer.getElement();
            }
            pointer = pointer.getNext();
        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
    }
    
}
