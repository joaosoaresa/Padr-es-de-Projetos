/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocomposite1;

/**
 *
 * @author joaos
 */
public class ExemploComposite1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Componente C1 = new Elipse();
        GraficoComposite C2 = new GraficoComposite();
        
        try{
            ((GraficoComposite) C2).add(C1);
            C1.print();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
