package atividade15;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaTemperaturas = 0;
        int numeroLeituras = 0;
        System.out.println("Iniciando o cálculo da média de temperatura para 24 horas.");
        while (numeroLeituras < 24) {
            System.out.print("Digite a temperatura da hora " + (numeroLeituras + 1) + ": ");
            double temperaturaAtual = sc.nextDouble();
            somaTemperaturas += temperaturaAtual;
            numeroLeituras++;
        }
        double mediaTemperatura = somaTemperaturas / numeroLeituras;
        System.out.println("\nMédia de temperatura durante as 24 horas: " + mediaTemperatura + "°C");
    }
}