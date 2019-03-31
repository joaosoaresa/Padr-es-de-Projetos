/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarioexemplo;

/**
 *
 * @author joaos
 */
public class Facade {
    private maquinaLavarRoupa lr;
    
    public Facade(){
        this.lr = new maquinaLavarRoupa();
            
    }
    
    public void ligarMaquina() {
        lr.nivelAgua("média");
        lr.addDetergente("muito");
    }
    
}
