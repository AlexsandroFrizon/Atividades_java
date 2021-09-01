/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Atividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int tolaFuncionarios = ler.nextInt();
        int totalClientes = ler.nextInt();

        Queue<Funcionario> queue = new PriorityQueue<>();
        int[] tFuncionarios = new int[tolaFuncionarios];
        int[] numeroItensClientes = new int[totalClientes];

        for (int i = 0; i < tolaFuncionarios; i++) {
            tFuncionarios[i] = ler.nextInt();
        }
        for (int i = 0; i < tolaFuncionarios; i++) {
            queue.add(new Funcionario(i, 0));
        }

        for (int i = 0; i < totalClientes; i++) {
            numeroItensClientes[i] = ler.nextInt();
        }

        for (int i = 0; i < totalClientes; i++) {
            Funcionario f = queue.poll();
            int currId = f.id;
            int currTempo = f.tempo;
            int tempoDessaCompra = numeroItensClientes[i] * tFuncionarios[currId];
            queue.add(new Funcionario(currId, currTempo + tempoDessaCompra));
        }

        int maxTempo = -1;
        while (queue.size() > 0) {
            Funcionario f = queue.poll();
            maxTempo = Math.max(f.tempo, maxTempo);
        }

        System.out.println(maxTempo);

    }
}
