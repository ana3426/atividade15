package atividade15;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = 1000;
        double total = 0;
        int hora = 1;
        while (hora <= 5) {
            System.out.println("Hora " + hora + ": " + consumo + " watts");
            total += consumo;
            consumo *= 1.10; // aumenta 10%
            hora++;
        }
        System.out.println("Consumo total após 5 horas: " + total + " watts");
    }
}
