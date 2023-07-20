package com.logica.programa;

import java.util.Scanner;

public class ListaExercicio3 {

    Scanner n = new Scanner(System.in);

    /*
     * Exercício 1:
     * 1) Escreva um programa que sirva como um cronômetro. O usuário deve digitar
     * um numero em segundos
     * e o programa deve contabilizar os segundos digitados. O programa deve receber
     * somente números entre 1 e 59,
     * do contrário ele retornará um erro e solicitará que o usuário digite um
     * número válido.
     */
    void exercicio1() {
        System.out.println("exercício 1");

        int num;
        int cont = 0;
        System.out.println("Aplicativo de cronômetro. ");
        System.out.println("Quantos segundos você quer cronometrar? ");
        num = n.nextInt();

        while (cont <= num) {
            System.out.println(cont + ",");
            cont++;
        }
        try {
            Thread.sleep(1000);
            ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * import java.util.Scanner;
         * 
         * public class CronometroSimulado {
         * 
         * public static void main(String[] args) {
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.print("Digite um número de 1 a 59: ");
         * int numeroDigitado = scanner.nextInt();
         * 
         * if (numeroDigitado < 1 || numeroDigitado > 59) {
         * System.out.println("Erro: O número deve estar entre 1 e 59.");
         * return;
         * }
         * 
         * System.out.println("Iniciando cronômetro...");
         * for (int i = 0; i <= numeroDigitado; i++) {
         * System.out.printf("%02d segundos%n", i);
         * try {
         * Thread.sleep(1000); // Aguarda 1 segundo (1000 milissegundos)
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         * }
         * System.out.println("Cronômetro encerrado.");
         * }
         * }
         * 
         * 
         * 
         */

    }

    /*
     * Exercício 2:
     * 2) Desenvolva um programa que receba um número do usuário eescreva a tabuada
     * dele
     */
    void exercicio2() {
        System.out.println("exercício 2");
    }

    /*
     * Exercício 3:
     * 3) Aproveite o código dos exercícios anteriores e escreva um código que
     * receba dois números inteiros
     * e escreva todos osnúmeros pares entre eles.
     */

    void exercicio3() {
        System.out.println("exercício 3: ");
    }

    /*
     * Exercício 4:
     * 4) Um cliente que promove eventos e solicitou um programa queseja capaz de
     * identificar se uma pessoa é maior de idade.
     * Pessoas com menos de 16 anos não podem entrar nos eventos. Entre 16 e18 anos
     * somente acompanhado pelos responsáveis.
     * Maiores de 18podem entrar normalmente. Escreva o programa em Java.
     */
    void exercicio4() {
        System.out.println("Exercício 4: ");
    }

    /*
     * Exercício 5.
     * 5) Crie um algoritmo que receba login e senha e verifique ascredenciais.
     * Caso algum deles estiver errado o programa deveretornar ao usuário quais das
     * opções está errada, se é o login ou asenha.
     * O programa deve bloquear o acesso após 3 tentativaserradas.
     * Quando for a última tentativa ele deve emitir um
     * alerta:"Última tentativa, mais um erro seu acesso será bloqueado!"
     */

    void exercicio5() {
        System.out.println("Exercício 5:");
    }
}
