/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

import com.mycompany.smarc.Paciente;

/**
 *
 * @author Gustavo
 */
public class AgObesi {

    float imc;

    public AgObesi() {
    }
    
    
    public float calculaESetaImc(Paciente paciente, float peso, float altura) {

        Paciente p = new Paciente(peso, altura);

        altura = (float) Math.pow(altura, 2);
        imc = peso / altura;
        
        if (imc < 20.0) {
            paciente.getImc().setAbaixoDoPeso(true);
        } else if (imc >= 20.0 && imc <= 24.9) {
            paciente.getImc().setPesoNormal(true);
        } else if (imc >= 25.0 && imc <= 29.0) {
            paciente.getImc().setPesoLeve(true);
        } else if (imc >= 30 && imc <= 39.9) {
            paciente.getImc().setObesidadeModerada(true);
        } else {
            paciente.getImc().setObesidadeGrave(true);
        }
        
        return imc;
    }

    public void avaliacaoCardiologica(Paciente paciente, float peso, float altura) {
        float imc = calculaESetaImc(paciente, peso, altura);
        float grauEvidencia;
        
        
        if(imc < 25){
            grauEvidencia = (float) 0.0;
        }else if(imc > 40){
            grauEvidencia = (float) 100.0;
        }
        else{
            grauEvidencia = (imc - 25) / (40-25);
        }
        
        System.out.println("A avaliacao cardiologica e de: %" + grauEvidencia + " por cento");
    }

}
