/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

//Loreno E. Ribeiro, 0403444
//Guilherme M. Moretti, 0402987

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Usuário
 */
public class Retirada implements Serializable{
        
    private LocalDateTime dataHora;
    private Aluno aluno;
    private Equipamento equipamento;
    private String flag;

    public Retirada(Aluno aluno, Equipamento equipamento) {
        this.aluno = aluno;
        this.equipamento = equipamento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    @Override
    public String toString() {
        return "RetiradaClass{" + "aluno=" + aluno + ", equipamento=" + equipamento + ", flag=" + flag + '}';
    }

}
