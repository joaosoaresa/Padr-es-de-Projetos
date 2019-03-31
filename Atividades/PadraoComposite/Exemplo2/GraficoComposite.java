/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocomposite1;

import java.util.ArrayList;

/**
 *
 * @author joaos
 */
public class GraficoComposite extends Componente {
    protected ArrayList<Componente> listaComponentes;
    
    public GraficoComposite() {
        this.listaComponentes = new ArrayList<Componente>();
        
    }
    
    public void add(Componente c) {
        this.listaComponentes.add(c);
    }
    
    
    public void print() {
        for(Componente e: listaComponentes){
            e.print();
            
        }
    }
    
}
