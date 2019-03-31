/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author joaos
 */
public class Teste {
    
    public static void main(String[] args) {
     
        calculadoraSoma c1 = new calculadoraSoma();
        
        adapterCalculo a = new adapterCalculo(c1);
        a.fazerMultiplicacao(7,5);
    }
    
}
