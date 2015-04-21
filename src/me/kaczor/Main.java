package me.kaczor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("N: ");
        int n = reader.nextInt();

        QueensProblemGenerator queensProblemGenerator = new QueensProblemGenerator();

        System.out.println(queensProblemGenerator.generate(n, false));
    }

}
