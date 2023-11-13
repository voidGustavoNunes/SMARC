/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smarc;



/**
 *
 * @author Gustavo
 */
public class AgObesi {

    float imc;
    
    public void calculaImc(Paciente paciente, float peso, float altura){
        
        Paciente p = new Paciente(peso, altura);
        
        altura = (float) Math.pow(altura, 2);
        imc = peso/altura;
        
        p.setImc(imc); //seta o imc ao paciente
    }
    
    public void avaliacaoCardiologica(Paciente paciente){
        imc = paciente.getImc();
        if(imc < 20.0){
            abaixoDoPeso
        }
    
    
    }
    
}
