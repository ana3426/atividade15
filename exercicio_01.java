package atividade15;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasProduzidas = 0;
        System.out.println("Iniciando a contagem de peças...");
        // O laço continuara enquanto o número de peças produzidas for menor que 100.
        while (pecasProduzidas < 100) {
            pecasProduzidas++;
            System.out.println("Peça " + pecasProduzidas + " produzida.");
        }
        System.out.println("Contagem finalizada. Total de peças: 100.");
    }
}