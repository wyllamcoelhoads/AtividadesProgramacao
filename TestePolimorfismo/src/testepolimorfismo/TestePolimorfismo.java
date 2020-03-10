/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepolimorfismo;

/**
 *
 * @author wylla
 */
public class TestePolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraCientifica cf = new CalculadoraCientifica();
        Calculo c = new Calculo();
        System.out.println(cf.somar(20.78, 10.00));
        System.out.println(c.somar(1.0, 5.0));
    }
    
}
