/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteexemplo;

/**
 *
 * @author joaos
 */
public class ComputadorFacade {
    private Cpu cpu;
    private Memoria memoria;
    private DiscoRigido discoRigido;
    
    public ComputadorFacade() {
        this.cpu = new Cpu();
        this.discoRigido = new DiscoRigido();
        this.memoria = new Memoria();
        
    }
    
    public void ligarComputador(){
        cpu.processaDado();
        memoria.carregaDados();
        discoRigido.leDado();
    }
    
}
