package EXERCICIOS1.src.exercicios;
import java.util.Scanner;

public class Exercicio01FeitoM {
    //Abre-se uma função Exercicio 01 a ser atribuida a função do metodo main quando requisitada
    public static boolean valida_palete(){

        // Aqui é um exemplo de codigo limpo, onde nao se tem um numero magico no IF/Else, e sim uma variavel de numero fixo, onde a variavel ira ser
        //requisitada, para ter uma leitura de codigo limpo mais facil
        int qtd_minima_de_caixa = 10;
        int qtd_minima_de_pallet = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de caixas necessárias para montar um pallet novo");
        int caixa = scan.nextInt();

        System.out.println("Insira quantos pallets têm disponíveis no momento");
        int palletDisponivel = scan.nextInt();
        scan.close();


        if(caixa >= qtd_minima_de_caixa && palletDisponivel >= qtd_minima_de_pallet){
            return true;
        }
        //eu demonstro que essa validacao é false
        return false;
    }
        //No Main é onde vai iniciar o codigo a ser executado        
    public static void main(String[] args) {

        //aqui ele valida a variavel tipo booleana `valida` como true e false, se for true cai no IF, se for false é else
        //pois na programação é lido como 1 ou 0, se caso passar a validacao de quantidade é 1, se nao é 0.
        boolean valido = valida_palete();

        //funciona do mesmo jeito que --- if (valido == true)
        if(valido){
            System.out.println("A quantidade passou na validação");
            System.out.println("A quantidade de pallet é disponível");
        }else{
            System.out.println("Caixas insuficiente ou não tem pallet disponível");
        }


    }
    
} 