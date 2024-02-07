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
public class Equipamento implements Serializable{
    
    private String codNotebook,
                   codCarregador,
                   codMaleta;
    private int contCodNotebook,
                contCodCarregador,
                contCodMaleta;

    public Equipamento(String codNotebook, String codCarregador, String codMaleta, int contCodNotebook, int contCodCarregador, int contCodMaleta) {
        this.codNotebook = codNotebook;
        this.codCarregador = codCarregador;
        this.codMaleta = codMaleta;
        this.contCodNotebook = contCodNotebook;
        this.contCodCarregador = contCodCarregador;
        this.contCodMaleta = contCodMaleta;
    }

    public String getCodNotebook() {
        return codNotebook;
    }

    public void setCodNotebook(String codNotebook) {
        this.codNotebook = codNotebook;
    }

    public String getCodCarregador() {
        return codCarregador;
    }

    public void setCodCarregador(String codCarregador) {
        this.codCarregador = codCarregador;
    }

    public String getCodMaleta() {
        return codMaleta;
    }

    public void setCodMaleta(String codMaleta) {
        this.codMaleta = codMaleta;
    }

    public int getContCodNotebook() {
        return contCodNotebook;
    }

    public void setContCodNotebook(int contCodNotebook) {
        this.contCodNotebook = contCodNotebook;
    }

    public int getContCodCarregador() {
        return contCodCarregador;
    }

    public void setContCodCarregador(int contCodCarregador) {
        this.contCodCarregador = contCodCarregador;
    }

    public int getContCodMaleta() {
        return contCodMaleta;
    }

    public void setContCodMaleta(int contCodMaleta) {
        this.contCodMaleta = contCodMaleta;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "codNotebook=" + codNotebook + ", codCarregador=" + codCarregador + ", codMaleta=" + codMaleta + ", contCodNotebook=" + contCodNotebook + ", contCodCarregador=" + contCodCarregador + ", contCodMaleta=" + contCodMaleta + '}';
    }
    
}
