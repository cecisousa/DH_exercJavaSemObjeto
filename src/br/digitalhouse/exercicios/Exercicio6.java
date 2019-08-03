package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(2);
        numeros.add(8);
        numeros.add(10);
        numeros.add(5);
        List<Integer> numerosPares = new ArrayList<>();
        {
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) % 2 == 0) {
                    numerosPares.add(numeros.get(i));


                }
            }
            System.out.println(numerosPares);
        }

    }
}
