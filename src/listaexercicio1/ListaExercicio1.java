/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexercicio1;

/**
 *
 * @author aluno
 */
public class ListaExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exercicio 1
        int numero = 10;
        System.out.println(numero);
        
        //exercicio 2
        double numeroFlutuante = 1.75;
        System.out.println(numeroFlutuante);
        
        //exercicio 3
        String disciplina = "Linguagem de programação";
        System.out.println(disciplina);
        
        //execicio 4
        int valorA = 12;
        int valorB = 24;
        int valorC = 32;
        int valorD = 48;
        
        int resultado = valorA + valorB + valorC + valorD;
        System.out.println(resultado / 4);
        
        //exercicio 5
        float valorPFA = (float) 2.6;
        float valorPFB = (float) 2.4;
        float valorPFC = (float) 3.2; 
        float valorPFD = (float) 3.0;
        
        float resultadoPF = valorPFA + valorPFB + valorPFC + valorPFD;
        
        System.out.println(resultadoPF / 4);
        
        //exercicio 6
        String mensagemBanco = "Banco de Dados";
        System.out.println("Disciplina " + mensagemBanco);
        
        //exercicio 7
        int nota = 5;
        if(nota > 10){
            System.out.println("é maior que 10");
        }else{
            System.out.println("é menor que 10");
        }
        
        //exercicio 8
        int media = 15;
        
        if(media % 2 == 0){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
        
        //exercicio 9
      for(int x = 0 ; x <= 10;x++){
          System.out.println(x);
      }
      
      //exercicio 10
      int controle = 0;
      while(controle <=1000){
          System.out.println(controle);
          controle = controle + 100;
      }
      
      //exercicio 11
      String[] nomes = {"Ana", "Leonardo","Cauã","Caio"};
      
      for(int i = 0 ; i < 4; i++){
          System.out.println(nomes[i]);
      }
      
      //exercicio 12
      
      int[] numerosLista = {10,9,8,7};
      for(int v = 0; v < numerosLista.length; v++ ){
          System.out.println(numerosLista[v]);
      }
      
        
        
    }
    
}
