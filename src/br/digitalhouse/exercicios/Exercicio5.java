package br.digitalhouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(10);
        numeros.add(8);
        numeros.add(3);
        numeros.add(5);
        int somaPares = 0;
        for (int i = 0; i < numeros.size(); i++){
            if(numeros.get(i)%2 == 0){
            somaPares = somaPares + numeros.get(i);}
        }
        System.out.println("A soma dos elementos pares é: "+somaPares);


    }
}
