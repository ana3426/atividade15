package atividade15;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estoque = 500;
        while (estoque >= 100) {
            System.out.println("Estoque atual: " + estoque);
            estoque -= 20;
        }
        System.out.println("Estoque abaixo do limite: " + estoque + " unidades. Monitoramento encerrado.");
    }
}
