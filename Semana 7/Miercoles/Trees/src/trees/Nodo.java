package trees;

public class Nodo {
    private int element;
    private Nodo[] sons;

    public Nodo(int element) {
        this.element = element;
        this.sons = new Nodo[0];
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    public boolean isLeaf() {
        return sons.length == 0;
    }
    
    
}
