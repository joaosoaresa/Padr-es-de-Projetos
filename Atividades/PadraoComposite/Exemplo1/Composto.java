/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author joaos
 */
public class Composto extends Elemento {
    protected ArrayList<Elemento> listaElementos;
    
    protected Composto(String texto) {
        this.Texto = texto;
        this.listaElementos = new ArrayList<Elemento>();
        
    }
    
    public void add(Elemento e) {
        this.listaElementos.add(e);
        
        
    }
    
    public void getTexto() {
        System.out.println(this.Texto);
        for(Elemento e : listaElementos) {
            e.getTexto();
        }
    }
    
}
