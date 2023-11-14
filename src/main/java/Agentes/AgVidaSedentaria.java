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
public class AgVidaSedentaria {

    public AgVidaSedentaria() {
    }
    
    
    public void diagnosticoVidaSedentaria(Paciente paciente, int qntdeAtividadesFisicas){
        
        if(qntdeAtividadesFisicas >= 4){
            paciente.setSedentario(0);
        
        }else if(qntdeAtividadesFisicas == 3){
            paciente.setSedentario((float) 0.25);
            
        }
        else if(qntdeAtividadesFisicas == 2){
            paciente.setSedentario((float) 0.5);
        
        }
        else if(qntdeAtividadesFisicas == 1){
            paciente.setSedentario((float) 0.25);
        }
        else if(qntdeAtividadesFisicas == 0){
            paciente.setSedentario((float) 1.00);
        }
        
        
    }
    
}
