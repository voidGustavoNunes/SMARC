/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smarc;

/**
 *
 * @author Gustavo
 */
public class Paciente {
    int id;
    float peso;
    float altura;
    Imc imc;
    boolean hipertenso = false;
    float sedentario;
    
    public Paciente() {
    }

    public float getSedentario() {
        return sedentario;
    }

    public void setSedentario(float sedentario) {
        this.sedentario = sedentario;
    }

    
    public boolean isHipertenso() {
        return hipertenso;
    }

    public void setHipertenso(boolean hipertenso) {
        this.hipertenso = hipertenso;
    }

    

    public Paciente(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente(int id, float peso, float altura) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Imc getImc() {
        return imc;
    }

    public void setImc(Imc imc) {
        this.imc = imc;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
