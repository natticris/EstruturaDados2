

package calculadora;

public class Pilha {
    private double pilha[];
    private int topo;
    
    public Pilha (int tamanho) {

        pilha = new double[tamanho];
        topo = -1;
    }
    
    public boolean isEmpty() {
        return topo <=-1;
    }
    
    public boolean isFull() {
        return topo == pilha.length-1;
        
    }    
    public int size() {

        return topo + 1;

    }
    
     public void push(double elemento) {
        
        if (isFull()) {
            System.out.println("Pilha esta cheia");
        } else {
            pilha[++topo] = elemento;
        }

    }
    public double pop() {
        if (isEmpty()) {

            return -1;
        } else {
           
            topo--;
            return pilha[topo + 1];
        }

    }
    
    public double top() {
        if (isEmpty()) {

            return -1;
        } else {

            return pilha[topo];
        }

    }
    
    public void imprime() {
        if (isEmpty()) {
            System.out.println("Pilha esta vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[topo] + "-");
            }
        }

    }
    
    
    
    
}


