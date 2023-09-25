/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista list = new Lista();
        for (int i = 0; i < 10; i++) {
            list.insertFinal(i);
        }
        list.insertAtIndex(84, 3);
        System.out.println("Antes");
        list.print();
        System.out.println("");
        System.out.println("Despues");
        list.deleteAtIndex(3);
        list.deleteBegin();
        list.deleteFinal();
        list.print();
        System.out.println("");
        System.out.println("********************************");
        ListaArray listArray = new ListaArray(12);
        for (int i = 0; i < 10; i++) {
            listArray.insertBegin(i);
        }
        listArray.insertAtIndex(84, 3);
        listArray.print();
        System.out.println("");
        System.out.println("DELETE");
        /*System.out.println("Memoria");
        listArray.printInMemory();*/
        listArray.deleteBegin();
        listArray.insertAtIndex(100, 1);
        listArray.print();
    }
    
}
