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
    private int minutosAposAcordarPrimeiroCigarro;
    private boolean dificilNaoFumarLocaisProibidos;
    private int qualCigarroDoDiaDaMaisSatisfacao;
    private int quantosCigarrosFumaDiariamente;
    private boolean fumaMaisfrequenteManha;
    private boolean fumaMesmoDoente;
    private int totalPontos;
    
    public void setMinutosAposAcordarPrimeiroCigarro(int minutos){
        minutosAposAcordarPrimeiroCigarro = minutos;
    }
    
    public void setDificilNaoFumarLocalProibido(boolean dificil){
        dificilNaoFumarLocaisProibidos = dificil; 
    }
    
    public void setQualCigarroDoDiaMaisSatisfacao(int qualCigarro){
        qualCigarroDoDiaDaMaisSatisfacao = qualCigarro;
    }
    
    public void setQuantosCigarrosFumaDiariamente(int quantos){
        quantosCigarrosFumaDiariamente = quantos;
    }
    
    public void setFumaMaisFrequenteManha(boolean manha){
        fumaMaisfrequenteManha = manha;
    }
    
    public void setFumaMesmoDoente(boolean mesmoDoente){
        fumaMesmoDoente = mesmoDoente;
    }
    
    public double geraSaida(){
        double saida = 0;
        totalPontos = 0;
        
        if(minutosAposAcordarPrimeiroCigarro <= 5) totalPontos = 3;
        else if(minutosAposAcordarPrimeiroCigarro <= 30) totalPontos = 2;
        else if(minutosAposAcordarPrimeiroCigarro <= 60) totalPontos = 1;
        else totalPontos = 0;
        
        if(dificilNaoFumarLocaisProibidos) totalPontos++;
        
        if(qualCigarroDoDiaDaMaisSatisfacao == 1) totalPontos++;
        
        if(quantosCigarrosFumaDiariamente <= 10) totalPontos = totalPontos + 0;
        else if(quantosCigarrosFumaDiariamente <= 20) totalPontos++;
        else if(quantosCigarrosFumaDiariamente <= 30) totalPontos = totalPontos + 2;
        else totalPontos = totalPontos + 3;
        
        if(fumaMaisfrequenteManha) totalPontos++;
        
        if(fumaMesmoDoente) totalPontos++;
        
        switch(totalPontos){
            case 0: saida = 0; break;
            case 3: saida = 0.25; break;
            case 5: saida = 0.5; break;
            case 8: saida = 0.75; break;
            case 10: saida = 1; break;
        }//switch
        
        return saida;
    }
}
