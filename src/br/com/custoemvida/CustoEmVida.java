package br.com.custoemvida;

import java.util.Scanner;

public class CustoEmVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual o seu salário mensal?");
        double salario = scanner.nextDouble();

        System.out.println("Quantas horas semanais você trabalha?");
        int numeroDeHorasPorSemana = scanner.nextInt();

        System.out.println("Qual o preço do produto/serviço?");
        double precoDaCoisa = scanner.nextDouble();

        int numeroDeSemanasNoMes = 4;
        int numeroDeHorasPorMes = numeroDeHorasPorSemana * numeroDeSemanasNoMes;
        double salarioPorHora = salario / numeroDeHorasPorMes;

       double valorPorHoraDeVida = precoDaCoisa / salarioPorHora;

        System.out.println("Olá " + nome + "! Você gastou " + String.format("%.2f", valorPorHoraDeVida )  + " horas de trabalho para adquirir esse produto/serviço!");

    }
}

/*
salario
numero de horas por semana
preço da coisa
Nome da pessoa
 */
