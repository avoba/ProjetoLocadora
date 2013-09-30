/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author paula_pacheco
 */
public abstract class pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    
    
    
}
