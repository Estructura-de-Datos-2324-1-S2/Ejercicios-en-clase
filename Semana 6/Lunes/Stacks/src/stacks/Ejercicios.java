/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Estudiante
 */
public class Ejercicios {

    public Ejercicios() {
    }
    
    public Stack ejercicio1(Stack p1, Stack p2){
        String result = "";
        boolean sumOne = false;
        Stack stack = new Stack();
        while (!p1.isEmpty() || !p2.isEmpty()){
            int aux1 = 0;
            int aux2 = 0;
            if (!p1.isEmpty()) {
                aux1 = (int) p1.pop().getElement();
            }
            
            if (!p2.isEmpty()) {
                aux2 = (int) p2.pop().getElement();
            }
            
            int suma = aux1 + aux2;
            if (sumOne) {
                suma++;
                sumOne = false;
            }
            if (suma >=10) {
                sumOne = true;
                suma -= 10;
            }
            
            result += suma;
        }
        for (int i = 0; i < result.length(); i++) {
            stack.push(result.charAt(i));
        }
        return stack;
    }
    
}
