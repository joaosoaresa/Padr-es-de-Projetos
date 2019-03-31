/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author joaos
 */
public class AdapterTomada extends TomadaDeDoisPinos {
    private TomadaDeTresPinos tomadaDeTresPinos;
    
    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }
    
    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
    
    
}
