/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

/**
 *
 * @author Gustavo
 */
public class PressaoArterial {
    int pressaoSanguineaSistolica;
    int pressaoSanguineaDiastolica;

    public int getPressaoSanguineaSistolica() {
        return pressaoSanguineaSistolica;
    }

    public void setPressaoSanguineaSistolica(int pressaoSanguineaSistolica) {
        this.pressaoSanguineaSistolica = pressaoSanguineaSistolica;
    }

    public int getPressaoSanguineaDiastolica() {
        return pressaoSanguineaDiastolica;
    }

    public void setPressaoSanguineaDiastolica(int pressaoSanguineaDiastolica) {
        this.pressaoSanguineaDiastolica = pressaoSanguineaDiastolica;
    }

    public PressaoArterial(int pressaoSanguineaSistolica, int pressaoSanguineaDiastolica) {
        this.pressaoSanguineaSistolica = pressaoSanguineaSistolica;
        this.pressaoSanguineaDiastolica = pressaoSanguineaDiastolica;
    }

    public PressaoArterial() {
    }
    
    
}
