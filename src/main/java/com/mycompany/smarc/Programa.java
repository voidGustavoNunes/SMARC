package com.mycompany.smarc;

import Agentes.AgNicotina;
import Agentes.AgObesi;
import Agentes.AgPressaoArterial;
import Agentes.AgVidaSedentaria;

public class Programa { 

    public String gerarSmarc(double peso, double altura, int qtdAtividadeFisica, int pressaoSistolica, int pressaoDiastolica, 
            boolean dificilNaoFumarLocalProibido, boolean fumaMaisFrequenteManha, boolean fumaMesmoDoente, 
            int qualCigarroDoDiaMaisSatisfacao, int quantosCigarrosFumaDiariamente, int minutosAposAcordarPrimeiroCigarro) {
        double riscoObesidade;
        double riscoPressaoSistolica;
        double riscoPressaoDiastolica;
        double riscoSedentarismo;
        double riscoTabagista;

        AgObesi obes = new AgObesi();
        obes.setAltura(altura); // 1.72
        obes.setPeso(peso); // 96.5
        obes.geraIMC();
        riscoObesidade = obes.produzSaida();

        // Concatenando os resultados em uma string
        StringBuilder resultado = new StringBuilder();
        resultado.append("Risco Cardíaco (obesidade): ").append(riscoObesidade).append("\n");

        AgPressaoArterial sisto = new AgPressaoArterial();
        sisto.setPressao(pressaoSistolica); // 135
        riscoPressaoSistolica = sisto.geraSaidaSistolica();

        resultado.append("\nRisco Cardíaco (Pressão Sistólica): ").append(riscoPressaoSistolica).append("\n");

        AgPressaoArterial diasto = new AgPressaoArterial();
        diasto.setPressao(pressaoDiastolica); // 92
        riscoPressaoDiastolica = diasto.geraSaidaDiastolica();

        resultado.append("\nRisco Cardíaco (Pressão Diastólica): ").append(riscoPressaoDiastolica).append("\n");

        AgVidaSedentaria seden = new AgVidaSedentaria();
        seden.setFreqAtividadeFisicaSemanal(qtdAtividadeFisica); // 2
        riscoSedentarismo = seden.geraSaida();

        resultado.append("\nRisco Cardíaco (Sedentarismo): ").append(riscoSedentarismo).append("\n");

        AgNicotina tabac = new AgNicotina();
        tabac.setDificilNaoFumarLocalProibido(dificilNaoFumarLocalProibido);
        tabac.setFumaMaisFrequenteManha(fumaMaisFrequenteManha);
        tabac.setFumaMesmoDoente(fumaMesmoDoente);
        tabac.setMinutosAposAcordarPrimeiroCigarro(minutosAposAcordarPrimeiroCigarro);
        tabac.setQualCigarroDoDiaMaisSatisfacao(qualCigarroDoDiaMaisSatisfacao);
        tabac.setQuantosCigarrosFumaDiariamente(quantosCigarrosFumaDiariamente);
        riscoTabagista = tabac.geraSaida();

        resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append("\n");

        resultado.append("\nUsando LOGICA PARACONSISTENTE: \n");

        AgAvaliador aval = new AgAvaliador(0.65);
        aval.setRiscoObesidade(riscoObesidade);
        aval.setRiscoPressaoDiastolica(riscoPressaoDiastolica);
        aval.setRiscoPressaoSistolica(riscoPressaoSistolica);
        aval.setRiscoSedentarismo(riscoSedentarismo);
        aval.setRiscoTabagismo(riscoTabagista);

        resultado.append(aval.avaliacao());
        
        return resultado.toString();
    }

}
