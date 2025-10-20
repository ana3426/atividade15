package atividade15;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pecas = 0;
        int tempoPorPeca = 60;
        int tempoTotal = 0;
        while (pecas < 10) {
            tempoTotal += tempoPorPeca;
            System.out.println("Peça " + (pecas + 1) + " produzida em " + tempoPorPeca + " segundos.");
            tempoPorPeca -= 10; // a cada peça, diminui 10 segundos
            pecas++;
        }
        System.out.println("Tempo total de produção: " + tempoTotal + " segundos");
    }
}
