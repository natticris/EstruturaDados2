
package calculadora;

public class Fila {
    
    private int fila[];
    private int inicio;
    private int fim;
    
    public Fila (int tamanho){
        
        fila = new int [tamanho];
        inicio = fim = -1;
        
       
    }
    
    public boolean isEmpty(){
        return fim == -1;
    }
    
    public boolean isFull(){
       return  fim == fila.length-1 ;
    }
    
    public int size(){
        return fim+1;
    }
    public void enqueue (int elemento){
        if (isFull()){
            System.out.println("Fila esta cheia");
        }else{
            fim++;
            fila[fim] = elemento;
            if (inicio == -1){
                inicio++;
            }
            
        }
           
    }
    public int dequeue (){
         if (isEmpty()){
            return -1;
        }else{
             int aux = fila[inicio];
             for (int i = inicio; i < fim ; i++){
                 fila[i] = fila[i+1];
                 
             }
             fim--;
             if (fim == -1 ){
                 inicio--;
             }
             return aux;
             
             
         }
    }
    public int front(){
        if (isEmpty()){
            return -1;
        }else{
            return fila[inicio];
        }
        
    }
    public void imprime (){
        
        for (int i = inicio; i <= fim; i++){
            System.out.println(fila[i]);
        }
    }
}
    
    

