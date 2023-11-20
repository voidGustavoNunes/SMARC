/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

/**
 *
 * @author Gustavo
 */
public class AgPressaoArterial {

    private double pressao;

    public double geraSaidaSistolica() {
        double saida;
        
        if (pressao <= 120) {
            saida = 0;
        } else if (pressao >= 140) {
            saida = 1;
        } else {
            saida = ((pressao - 120) / (140 - 120));
        }

        return saida;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double geraSaidaDiastolica() {
        double saida;

        if (pressao <= 80) {
            saida = 0;
        } else if (pressao >= 90) {
            saida = 1;
        } else {
            saida = ((pressao - 80) / (90 - 80));
        }

        return saida;
    }

}
