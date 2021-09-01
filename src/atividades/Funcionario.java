/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

/**
 *
 * @author alexs
 */
public class Funcionario {

    int id;
    int tempo;

    public Funcionario(int id, int tempo) {
        this.id = id;
        this.tempo = tempo;
    }


    public int compareTo(Funcionario f) {
        if (this.tempo - f.tempo == 0) {
            return this.id - f.id;
        }
        return this.tempo - f.tempo;
    }
}
