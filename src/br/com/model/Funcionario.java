/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author paula_pacheco
 */
public class Funcionario extends pessoa{
    private String login;
        private String senha;

    @Override
    public String toString() {
        return "Funcionario{" + "login=" + login + ", senha=" + senha + '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
