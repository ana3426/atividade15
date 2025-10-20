package atividade15;

import java.util.Random;

public class exercicio_10 {
    public static void main(String[] args) {
        Random random = new Random();
        int falhasConsecutivas = 0;
        while (falhasConsecutivas < 5) {
            boolean falha = random.nextBoolean();
            if (falha) {
                falhasConsecutivas++;
                System.out.println("Falha detectada! Consecutivas: " + falhasConsecutivas);
            } else {
                falhasConsecutivas = 0;
                System.out.println("Sensor normalizado. Reiniciando contagem de falhas.");
            }
        }
    }
}