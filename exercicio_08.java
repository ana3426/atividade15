package atividade15;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pecas = 0;
        int falhas = 0;
        while (falhas < 50 && pecas < 10000) {
            pecas += 500;
            falhas += 5; // supondo 5 falhas a cada 500 peças
            System.out.println("Peças produzidas: " + pecas + " | Falhas: " + falhas);
        }
        System.out.println("Número máximo de falhas atingido: " + falhas);
    }
}
