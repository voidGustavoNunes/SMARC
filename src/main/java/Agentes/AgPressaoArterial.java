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
public class AgPressaoArterial{

    public AgPressaoArterial() {
    }

    
    
    public int calculaPressaoSistolica(int pressaoSistolica){
        int calculoFinal;
        
        calculoFinal = (pressaoSistolica - 120) / (140 - 120);
        
        return calculoFinal;
    }
    
    
    public int calculaPressaoDiastolica(int pressaoDiastolica){
        int calculoFinal;
        
        calculoFinal = (pressaoDiastolica - 80) / (90 - 80);
        
        return calculoFinal;
    }
    
    
    public void diagnosticoPressaoArterial(Paciente paciente,int pressaoSistolica, int pressaoDiastolica){
        pressaoSistolica = calculaPressaoSistolica(pressaoSistolica);
        pressaoDiastolica = calculaPressaoDiastolica(pressaoDiastolica);
        
        if(pressaoSistolica>= 140 || pressaoDiastolica >= 90){
            System.out.println("\nO paciente possui uma pressaoSistolica de " + pressaoSistolica + "e uma pressaoDiastolica de "
                    + pressaoDiastolica + " por isso é hipertenso");
            paciente.setHipertenso(true);
        
        }
        else if(pressaoSistolica <= 120 && pressaoDiastolica <= 80){
            paciente.setHipertenso(false);
        
        }
    
    }

    
    
    
}
