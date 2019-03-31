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
public class adapterCalculo extends Multiplicacao {
    private calculadoraSoma CalculaSoma;
    
    public adapterCalculo(calculadoraSoma CalculaSoma){
        this.CalculaSoma = CalculaSoma;
        
    }
    @Override
    public void fazerMultiplicacao(int t1,  int t2){
        CalculaSoma.fazerSoma(t1, t2);
    }
}
