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
public class CalculadoraCientifica extends Calculo {
    
    @Override
    public final double somar(double a, double b){
        double c = a + b;
        return c;
    }
}
