/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes;

/**
 *
 * @author wylla
 */
public class Questoes {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
           Guarrafa pet = new Guarrafa();
           pet.setLiquido("coca cola");
           pet.setCapacidadeLiquido(2.5);
           pet.setPrecoUnitario(5.67);
           System.out.println(pet);
           int quantidade = 2;
           System.out.println("Quantidade = "+quantidade);
           System.out.println("Preço venda R$ "+pet.calcularVenda(quantidade));           
   }
}
