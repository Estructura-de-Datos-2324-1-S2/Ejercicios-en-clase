/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class Ejercicios {

    public Ejercicios() {
    }
    
    public Lista ejercicio4(Lista lista1,Lista lista2,Lista lista3){
        Lista lista = new Lista();
        Nodo pointer1 = lista1.getHead();
        Nodo pointer2 = lista2.getHead();
        Nodo pointer3 = lista3.getHead();
        
        while (pointer1 != null) {
            lista.insertFinal(pointer1.getElement());
            pointer1 = pointer1.getNext();
        }
        
        Nodo pointerListaFinal = lista.getHead();
        while (pointer2 != null) {
            
            if(pointerListaFinal != null) {
                pointerListaFinal.setElement((int)(pointerListaFinal.getElement()) +(int)(pointer2.getElement()));
                pointerListaFinal = pointerListaFinal.getNext();
            } else {
                lista.insertFinal(pointer2.getElement());
            }
            pointer2 = pointer2.getNext();
        }
        
        pointerListaFinal = lista.getHead();
        while (pointer3 != null) {
            
            if(pointerListaFinal != null) {
                pointerListaFinal.setElement((int)pointerListaFinal.getElement() +(int) pointer3.getElement());
                pointerListaFinal = pointerListaFinal.getNext();
            } else {
                lista.insertFinal(pointer3.getElement());
            }
            pointer3 = pointer3.getNext();
        }
        
        return lista;
    }
    
    public Lista ejercicio8(Lista lista){
        Lista result = new Lista();
        Nodo pointer = lista.getHead();
        while (pointer != null) {
            if ((int)pointer.getElement()%2 == 0){
                result.insertFinal(pointer.getElement());
            }
            pointer = pointer.getNext();
        }
        
        pointer = lista.getHead();
        while (pointer != null) {
            if ((int)pointer.getElement()%2 != 0){
                result.insertFinal(pointer.getElement());
            }
            pointer = pointer.getNext();
        }
        return result;
    }
}
