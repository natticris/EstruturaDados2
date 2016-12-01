
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Calculadora {
    
    public static void main(String [] args){
        
        String expressao =JOptionPane.showInputDialog("Digite a expressao");
        String[] valores = divide(expressao);
        boolean flag = true;
        
        Pilha hp = new Pilha(10);
        
        for (int i = 0; i < valores.length; i++){
            if (isNumber (valores[i])){
                
                hp.push(Double.parseDouble(valores[i]));
                                
            }else{
                if (hp.size() < 2){
                    flag = false;
                    break;
                }else {
                    double operandoB = hp.pop();
                    double operandoA = hp.pop();
                    double resultado = 0;
                    switch (valores[i]){
                        case "+":
                            resultado = operandoA + operandoB;
                            break;
                        case "-":
                            resultado = operandoA - operandoB;
                            break;
                        case "*":
                            resultado = operandoA * operandoB;
                            break;     
                        case "/":
                            resultado = operandoA / operandoB;
                            break; 
                    }
                    hp.push(resultado);
                }
            }
            
        }
        if (hp.size()== 1 && flag){
           JOptionPane.showMessageDialog(null, "O resultado é " + hp.pop());
            
        }else{
            JOptionPane.showMessageDialog(null, "Expressao mal formada");
        }
    }
    public static boolean isNumber(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
     public static String[] divide(String expressao) {
        return expressao.split("\\s+");
    }
    
}
