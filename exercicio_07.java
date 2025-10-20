package atividade15;

public class exercicio_07 {
    public static void main(String[] args) {
        int velocidade = 0;
        int incremento = 100;
        while (velocidade < 1000) {
            velocidade += incremento;
            System.out.println("Velocidade atual: " + velocidade + " RPM");
        }
        System.out.println("Velocidade máxima atingida!");
    }
}
