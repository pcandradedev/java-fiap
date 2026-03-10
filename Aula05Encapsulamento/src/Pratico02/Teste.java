package Pratico02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = input.nextInt();
        System.out.println("Digite o mes: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();

        Data data  = new Data();
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);

        System.out.println("Data: " + data.getDataFormatada());
        System.out.println("Mês: " + data.getNomeMes());
    }
}
