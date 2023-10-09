/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Estudiante
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicios ej = new Ejercicios();
        Lista lista1= new Lista();
        Lista lista2= new Lista();
        Lista lista3= new Lista();
        for (int i = 0; i < 6; i++) {
            lista1.insertFinal(i);
        }
        for (int i = 0; i < 10; i++) {
            lista2.insertFinal(i);
        }
        for (int i = 0; i < 4; i++) {
            lista3.insertFinal(i);
        }
        
        Lista resultado = ej.ejercicio4(lista1, lista2, lista3);
        System.out.println("La lista Resultado es:");
        resultado.print();
        System.out.println("");
        
        System.out.println("Ejercicio 2");
        resultado = ej.ejercicio8(lista2);
        System.out.println("La lista Resultado es:");
        resultado.print();
    }
    
}
