/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeum;

/**
 *
 * @author wylla
 */
public class Exeum {
    String txt;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ValidaImposto pessoa = new ValidaImposto();
         System.out.println(pessoa.calculaImposto(100, "INSS"));
         System.out.println(pessoa.calculaImposto("INSS"));
    }
    
}
