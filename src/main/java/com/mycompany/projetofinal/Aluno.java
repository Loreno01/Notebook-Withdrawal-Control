/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

//Loreno E. Ribeiro, 0403444
//Guilherme M. Moretti, 0402987

import java.io.Serializable;

/**
 *
 * @author Usuário
 */
public class Aluno implements Serializable{
  
    private String nome,
                   matricula;
    private int cont;

    public Aluno(String nome, String matricula, int cont) {
        this.nome = nome;
        this.matricula = matricula;
        this.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", cont=" + cont + '}';
    }
    
}
