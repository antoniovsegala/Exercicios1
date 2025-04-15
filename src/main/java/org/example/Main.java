package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Digite o primeiro número para somar:");
        x = sc.nextInt();
        System.out.println("Digite o segundo número para somar:");
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("O resultado da soma é " + soma);

        sc.close();
        }
    }
