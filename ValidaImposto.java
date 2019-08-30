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
public class ValidaImposto {
    
    public double calculaImposto(double valorBase, String nomeImposto){
        double taxaBase = calculaImposto(nomeImposto);
        double valorImposto = (valorBase + taxaBase/100);
        return valorImposto;
        
    }
    
    public double calculaImposto(String nomeImposto){
        double impostoRetorno = 0;
        switch (nomeImposto.toUpperCase()){
            case "INSS":
                impostoRetorno = 8;
            break;
            case "IR":
                impostoRetorno = 20;
            break;
         
        }
        return impostoRetorno;
    }
    
    
    
}
