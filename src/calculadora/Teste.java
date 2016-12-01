

package calculadora;

import java.util.Scanner;

/**
 *
 *
 */
public class Teste {
    
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        
        FilaEstatica f = new FilaEstatica(6);
        
        
        System.out.println(f.isEmpty());
        System.out.println(f.isFull());
        System.out.println(f.size());
        f.enqueue(5);
        System.out.println(f.size());
        
        f.enqueue(5);
        f.enqueue(5);
        f.enqueue(5);
        f.enqueue(5);
        f.enqueue(5);
        f.enqueue(5);
       
        
        System.out.println(f.isEmpty());
        System.out.println(f.isFull());
        System.out.println(f.size());
        System.out.println(f.dequeue());
        int a = f.dequeue();
        System.out.println(a*2);
        f.front();
        f.imprime();
    }
        
    }
    
