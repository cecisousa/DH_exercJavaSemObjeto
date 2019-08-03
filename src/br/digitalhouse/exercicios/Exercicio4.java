package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(11);
        numeros.add(7);
        numeros.add(5);
        int soma = 0;
        for(int i = 0; i < numeros.size(); i++) {
            soma = soma + numeros.get(i);
        }
            System.out.println("A soma dos elementos é: "+soma);


    }
}
