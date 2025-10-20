package atividade15;

import java.util.Random;

public class exercicio_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int pressao = 0;
        while (pressao < 120) {
            pressao = random.nextInt(130); // gera um valor aleatório até 129
            System.out.println("Pressão atual: " + pressao + " psi");
        }
        System.out.println("Pressão limite atingida! Encerrando sistema...");
    }
}
