/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobles;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        ListaDoble list = new ListaDoble();
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                list.insertFinal(i);
            } else {
                list.insertBegin(i);
            }
        }
        System.out.println("Lista");
        list.print();
        System.out.println("Insert");
        list.insertAtIndex(84, 6);
        list.print();
    }
    
}
