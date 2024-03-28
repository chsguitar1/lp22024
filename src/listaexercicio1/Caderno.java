/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicio1;

/**
 *
 * @author aluno
 */
public class Caderno {

    public void exercicioNumeroUM() {
        //exercicio 1
        int numero = 10;
        System.out.println("Resultado do Exercicio 1"
                + "= " + numero);
    }

    public void exercicioNumeroDois() {
        //exercicio 2
        double numeroFlutuante = 1.75;
        System.out.println(numeroFlutuante);
    }

    public void exercicioNumeroTres() {
        //exercicio 3
        String disciplina = "Linguagem de programação";
        System.out.println(disciplina);
    }

    public void exercicioNumeroQuatro() {
        //execicio 4
        int valorA = 12;
        int valorB = 24;
        int valorC = 32;
        int valorD = 48;

        int resultado = valorA + valorB + valorC + valorD;
        System.out.println(resultado / 4);
    }

    public void exercicioNumeroCinco() {
        //exercicio 5
        float valorPFA = (float) 2.6;
        float valorPFB = (float) 2.4;
        float valorPFC = (float) 3.2;
        float valorPFD = (float) 3.0;

        float resultadoPF = valorPFA + valorPFB + valorPFC + valorPFD;

        System.out.println(resultadoPF / 4);
    }

    public void exercicioNumeroSeis() {

        //exercicio 6
        String mensagemBanco = "Banco de Dados";
        System.out.println("Disciplina " + mensagemBanco);
    }

    public void exercicioNumeroSete() {
        //exercicio 7
        int nota = 5;
        if (nota > 10) {
            System.out.println("é maior que 10");
        } else {
            System.out.println("é menor que 10");
        }
    }

    public void exercicioNumeroOito() {
        //exercicio 8
        int media = 15;

        if (media % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }

    public void exercicioNumeroNove() {
        //exercicio 9
        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
        }

    }

    public void exercicioNumeroDez() {
        //exercicio 10
        int controle = 0;
        while (controle <= 1000) {
            System.out.println(controle);
            controle = controle + 100;
        }

    }

    public void exercicioNumeroOnze() {
        //exercicio 11
        String[] nomes = {"Ana", "Leonardo", "Cauã", "Caio"};

        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }
    }

    public void exercicioNumeroDoze() {
        //exercicio 12

        int[] numerosLista = {10, 9, 8, 7};
        for (int v = 0; v < numerosLista.length; v++) {
            System.out.println(numerosLista[v]);
        }

    }

    public void exercicioNumeroTreze() {
        double[] lista = {0.5, 0.6, 0.7};
        for (int i= 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

    }

}
