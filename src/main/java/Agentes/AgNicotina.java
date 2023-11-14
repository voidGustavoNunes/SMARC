/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

/**
 *
 * @author Gustavo
 */
public class AgNicotina {
    int valorTempoAcordar;
    
    public void diagnosticoNicotina(int tempoAcordar, int dificuldadeFumarIgrejas, int cigarroDia, int qntdeCigarros, int fumaManha,
            int fumaMesmoDoente){
        if(tempoAcordar <= 5){
            valorTempoAcordar = 3;
        }else if(tempoAcordar >= 6 && tempoAcordar >= 30){
            valorTempoAcordar = 2;
        }
        
    
    }
    
}
