/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author joaos
 */
public abstract class Elemento {
    protected String Texto;
    
    public void getTexto() {
        System.out.println(this.Texto);
    }
    
}
