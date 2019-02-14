/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaosala;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {
    
    private int interesse;
    private boolean vontbanheiro, duvida;
    
    public Aluno (){
        
    }
    
    public Aluno(int interesse, boolean vontbanheiro, boolean duvida, String nome, String matricula, int idade, boolean sexo) {
        super(nome, matricula, idade, sexo);
        this.interesse = interesse;
        this.vontbanheiro = vontbanheiro;
        this.duvida = duvida;
    }

    public int getInteresse() {
        return interesse;
    }

    public void setInteresse(int interesse) {
        this.interesse = interesse;
    }

    public boolean isVontbanheiro() {
        return vontbanheiro;
    }

    public void setVontbanheiro(boolean vontbanheiro) {
        this.vontbanheiro = vontbanheiro;
    }

    public boolean isDuvida() {
        return duvida;
    }

    public void setDuvida(boolean duvida) {
        this.duvida = duvida;
    }
    
    
            
}
