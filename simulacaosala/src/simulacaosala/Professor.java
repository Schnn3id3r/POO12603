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
public class Professor extends Pessoa{
    
    private String disciplina, conhecimento [];

    public Professor () {
        
    }

    public Professor(String disciplina, String[] conhecimento, String nome, String matricula, int idade, boolean sexo) {
        super(nome, matricula, idade, sexo);
        this.disciplina = disciplina;
        this.conhecimento = conhecimento;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String[] getConhecimento() {
        return conhecimento;
    }

    public void setConhecimento(String[] conhecimento) {
        this.conhecimento = conhecimento;
    }
    
    
}
