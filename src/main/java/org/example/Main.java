package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, soma;


        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;
        System.out.printf("O resultado da soma é " + soma);
        }
    }
