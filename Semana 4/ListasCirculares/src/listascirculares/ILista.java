/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listascirculares;


public interface ILista {
    public void insertBegin(Object element);
    public void insertFinal(Object element);
    public void insertAtIndex(Object element, int index);
    public Object deleteBegin();
    public Object deleteFinal();
    public Object deleteAtIndex(int index);
    public boolean isEmpty();
}
