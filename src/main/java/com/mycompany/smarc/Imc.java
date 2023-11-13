/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smarc;

/**
 *
 * @author Gustavo
 */
public class Imc {
    boolean abaixoDoPeso = false;
    boolean pesoNormal = false;
    boolean pesoLeve = false;
    boolean obesidadeModerada = false;
    boolean obesidadeGrave = false;

    public boolean isAbaixoDoPeso() {
        return abaixoDoPeso;
    }

    public void setAbaixoDoPeso(boolean abaixoDoPeso) {
        this.abaixoDoPeso = abaixoDoPeso;
    }

    public boolean isPesoNormal() {
        return pesoNormal;
    }

    public void setPesoNormal(boolean pesoNormal) {
        this.pesoNormal = pesoNormal;
    }

    public boolean isPesoLeve() {
        return pesoLeve;
    }

    public void setPesoLeve(boolean pesoLeve) {
        this.pesoLeve = pesoLeve;
    }

    public boolean isObesidadeModerada() {
        return obesidadeModerada;
    }

    public void setObesidadeModerada(boolean obesidadeModerada) {
        this.obesidadeModerada = obesidadeModerada;
    }

    public boolean isObesidadeGrave() {
        return obesidadeGrave;
    }

    public void setObesidadeGrave(boolean obesidadeGrave) {
        this.obesidadeGrave = obesidadeGrave;
    }

    public Imc() {
    }
    
}
