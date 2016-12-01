/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * 
 */
public class TestePilha {
    public static void main(String[] args){
        Pilha p = new Pilha(6);
        
        
        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        System.out.println(p.size());
        p.push(5);
        System.out.println(p.size());
        
        p.push(5);
        p.push(5);
        p.push(5);
        p.push(5);
        p.push(5);
        p.push(5);
        
        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        System.out.println(p.size());
        System.out.println(p.pop());
        double a = p.pop();
        System.out.println(a*2);
    }
}
