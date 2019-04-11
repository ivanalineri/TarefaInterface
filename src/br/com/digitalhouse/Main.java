package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        int escolha;
        int numero1;
        int numero2;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu das operações matemáticas:");
        System.out.println("Escolha sua operação;");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");

        escolha = scanner.nextInt();


        if (escolha == 1) {
            System.out.println(" A sua operação matemática é soma");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Entre com seus numeros para somar:");
            numero1 = scanner1.nextInt();
            System.out.println("Agora digite o segundo numero: ");
            numero2 = scanner1.nextInt();
            System.out.println("Seu resultado foi: " + soma.calcula(numero1, numero2));


        }
        if (escolha == 2) {
            System.out.println("A sua operação matemática é subtração");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Entre com os números para realizar a subtração");
            numero1 = scanner2.nextInt();
            System.out.println("Agora digite o segundo numero");
            numero2 = scanner2.nextInt();
            System.out.println("Seu resultado foi: " + subtracao.calcula(numero1, numero2));


        }

        if (escolha == 3) {
            System.out.println("A sua operação matemática é a Multiplicação");
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Entre com os números para realizar a multiplicação");
            numero1 = scanner3.nextInt();
            System.out.println("Agora digite o segundo número");
            numero2 = scanner3.nextInt();
            System.out.println("Seu resultado foi: " + multiplicacao.calcula(numero1, numero2));


        }

        if( escolha == 4){
            System.out.println("A sua operação matemática é a Divisão");
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Entre com os números para realizar a divisão");
            numero1 = scanner4.nextInt();
            System.out.println("Agora digite o segundo número");
            numero2 = scanner4.nextInt();
            System.out.println("Seu resultado foi: " + divisao.calcula(numero1, numero2));

        }

        if( escolha == 5){
            System.out.println("Obrigado por brincar com a gente.");


        }


    }
}
