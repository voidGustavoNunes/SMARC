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
        if (riscoObesidade == 0.0) {
            resultado.append("Risco Cardíaco (obesidade): ").append(riscoObesidade).append(" = O paciente está com peso normal").append("\n");
        }
        else if (riscoObesidade == 1.0) {
            resultado.append("Risco Cardíaco (obesidade): ").append(riscoObesidade).append(" = O paciente está com obesidade grave").append("\n");
        }
        else {
            resultado.append("Risco Cardíaco (obesidade): ").append(riscoObesidade).append(" = O paciente está com sobrepeso").append("\n");
        }

        AgPressaoArterial sisto = new AgPressaoArterial();
        sisto.setPressao(pressaoSistolica); // 135
        riscoPressaoSistolica = sisto.geraSaidaSistolica();
        resultado.append("\nRisco Cardíaco (Pressão Sistólica): ").append(riscoPressaoSistolica);

        AgPressaoArterial diasto = new AgPressaoArterial();
        diasto.setPressao(pressaoDiastolica); // 92
        riscoPressaoDiastolica = diasto.geraSaidaDiastolica();

        resultado.append("\tRisco Cardíaco (Pressão Diastólica): ").append(riscoPressaoDiastolica).append("\n");

        if (riscoPressaoSistolica == 0.0 && riscoPressaoDiastolica == 0.0) {
            resultado.append("\t = O paciente tem pressão arterial normal\n");
        }
        else if (riscoPressaoSistolica == 1.0 && riscoPressaoDiastolica == 1.0) {
            resultado.append("\t = O paciente tem pressão arterial elevada\n");
        }
        else {
            resultado.append("\t = O paciente tem pressão arterial média\n");
        }

        AgVidaSedentaria seden = new AgVidaSedentaria();
        seden.setFreqAtividadeFisicaSemanal(qtdAtividadeFisica); // 2
        riscoSedentarismo = seden.geraSaida();
        
        if (riscoSedentarismo == 0.0) {
            resultado.append("\nRisco Cardíaco (Sedentarismo): ").append(riscoSedentarismo).append(" = O paciente tem vida saudável").append("\n");
        }
        else if (riscoSedentarismo == 1.0) {
            resultado.append("\nRisco Cardíaco (Sedentarismo): ").append(riscoSedentarismo).append(" = O paciente tem vida obesidade grave").append("\n");
        }
        else {
            resultado.append("\nRisco Cardíaco (Sedentarismo): ").append(riscoSedentarismo).append(" = O paciente tem vida sedentária").append("\n");
        }

        AgNicotina tabac = new AgNicotina();
        tabac.setDificilNaoFumarLocalProibido(dificilNaoFumarLocalProibido);
        tabac.setFumaMaisFrequenteManha(fumaMaisFrequenteManha);
        tabac.setFumaMesmoDoente(fumaMesmoDoente);
        tabac.setMinutosAposAcordarPrimeiroCigarro(minutosAposAcordarPrimeiroCigarro);
        tabac.setQualCigarroDoDiaMaisSatisfacao(qualCigarroDoDiaMaisSatisfacao);
        tabac.setQuantosCigarrosFumaDiariamente(quantosCigarrosFumaDiariamente);
        riscoTabagista = tabac.geraSaida();
        
        if (riscoTabagista == 0.0) {
            resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append(" = O paciente tem baixa dependência de nicotina").append("\n");
        }
        if (riscoTabagista == 0.25) {
            resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append(" = O paciente exibe sinais de dependência de nicotina").append("\n");
        }
        if (riscoTabagista == 0.5) {
            resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append(" = O paciente é dependente moderado de nicotina").append("\n");
        }
        if (riscoTabagista == 0.75) {
            resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append(" = O paciente é dependente de nicotina").append("\n");
        }
        if (riscoTabagista == 1.0) {
            resultado.append("\nRisco Cardíaco (Tabagismo): ").append(riscoTabagista).append(" = O paciente é dependente grave de nicotina").append("\n");
        }

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
