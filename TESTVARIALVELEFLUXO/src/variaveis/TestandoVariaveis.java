package TESTVARIALVELEFLUXO.src.variaveis;

import java.util.Scanner;

public class TestandoVariaveis {
    public static void main(String[] args) {
        
        System.out.println("Validacao de compra no Bar do Moe");

        Scanner valor = new Scanner (System.in);
        
        System.out.println("insira a sua idade");
            int idade = valor.nextInt();
            
        if (idade > 105) {
            System.out.println("Idade invalida. O limite de idade é 105 anos.");
        } else {

        System.out.println("insira a quantidade de pessoas que te acompanham" );
            int quantidadePessoa =  valor.nextInt(); 
        //if (quantidadePessoa < 1) {
           // System.out.println("Já que voce nao possui ninguem junto com voce, infelizmente nao podera comprar a bebida");
        //}
        valor.close();

        if(idade >= 18){

            System.out.println("OK, voce tem mais de 18 anos");
            System.out.println("Voce pode comprar uma bebida");
        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Ok, voce e menor de idade mas pode comprar pois esta acompanhado");
            } else {
            System.out.println("Voce tem menos de 18 anos");
            System.out.println("E nao esta acompanhado");
        }
    }
    }
}
}