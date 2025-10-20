package atividade15;

public class exercicio_03 {
    public static void main(String[] args) {
        int hora = 0;
        int producaoTotal = 0;
        int producaoPorHora = 50;
        while (hora < 8) {
            producaoTotal += producaoPorHora;
            hora++;
            System.out.println("Hora " + hora + ": Produção total = " + producaoTotal);
        }
        System.out.println("Produção total em 8 horas: " + producaoTotal + " unidades");
    }
}
