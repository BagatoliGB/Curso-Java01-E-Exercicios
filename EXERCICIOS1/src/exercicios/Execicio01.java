package EXERCICIOS1.src.exercicios;

import java.util.Scanner;

public class Execicio01 {
    public static void main(String[] args) {
        
        System.err.println("insira a quantidade de caixas necessarias para montar um pallet novo");

        Scanner validador = new Scanner(System.in);

        int caixa = validador.nextInt();

        System.err.println("insira quantos pallets tem disponiveis no momento");
        int pelletDisponivel = validador.nextInt();
        

        if (caixa >= 10 && pelletDisponivel >= 1 ) {
            System.out.println("a quantidade de itens e pallets passou na validacao");
        } else { if (caixa < 10 || pelletDisponivel < 1)
            System.out.println("a quantidade de caixa ou pallet nao possou na validacao");
        }
        
        validador.close();
        
    }
}
