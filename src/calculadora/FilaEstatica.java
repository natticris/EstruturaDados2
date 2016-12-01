
package calculadora;
/**
 *
 * Natalia Oliveira 20470090
 */
public class FilaEstatica {
    private int fila[];
    private int inicio;
    private int fim;
    private int qtd;
    
    
    public FilaEstatica (int tamanho){
        fila = new int [tamanho];
        qtd = inicio = fim = 0;
       
    }
    
    public boolean isEmpty(){
        return qtd == 0;
    }
    
    public boolean isFull(){
       return  qtd == fila.length;
    }
    
    public int size(){
        return qtd;
    }
    
    public void enqueue (int elemento){
        if (isFull()){
            System.out.println("Fila esta cheia");
        }else{
            
            fila[fim] = elemento;
            qtd++;
            fim = (fim+1)% fila.length;
            
        }
           
    }
    public int dequeue (){
         if (isEmpty()){
            return 0;
        }else{
             int aux = fila[inicio];
             for (int i = fila[inicio]; i < fim ; i++){
                 fila[i] = fila[i+1];
                 
             }
             fim--;
             qtd--;
             
             inicio = (inicio+1)% fila.length;
             return aux;
             
             
         }
    }
    public int front(){
        if (isEmpty()){
            return 0;
        }else{
            return fila[inicio];
        }
        
    }
    public void imprime (){
        int i = 0; 
        for ( i = fila[inicio]; i < fim; i++){
            System.out.println(fila[i]);
        }
    }
    
    
}
