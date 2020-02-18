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
public class Guarrafa {
    private String liquido;
    private double capacidadeLiquido, precoUnitario;
    private int quantidade;
        public double calcularVenda(int quantidade){
        this.quantidade = quantidade;
        return this.quantidade * this.precoUnitario;
        }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

    public double getCapacidadeLiquido() {
        return capacidadeLiquido;
    }

    public void setCapacidadeLiquido(double capacidadeLiquido) {
        this.capacidadeLiquido = capacidadeLiquido;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
            @Override
    public String toString() {
        return "Guarrafa{" + "liquido=" + liquido + ", capacidadeLiquido=" + capacidadeLiquido + ", precoUnitario=" + precoUnitario + '}';
    }
}

