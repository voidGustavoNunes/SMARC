/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

/**
 *
 * @author Gustavo
 */
public class AgVidaSedentaria {
    
    private int freqAtividadeFisicaSemanal;
    
    public void setFreqAtividadeFisicaSemanal(int frequencia){
        freqAtividadeFisicaSemanal = frequencia;
    }
    
    public double geraSaida(){
        double saida;
        
        switch (freqAtividadeFisicaSemanal) {
            case 0:
                saida = 1;
                break;
            case 1:
                saida = 0.75;
                break;
            case 2:
                saida = 0.5;
                break;
            case 3:
                saida = 0.25;
                break;
            default:
                saida = 0;
                break;
        }
        
        return saida;
    }
}
