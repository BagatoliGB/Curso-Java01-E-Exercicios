package TESTVARIALVELEFLUXO.src.variaveis;

public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("Validacao de compra no Bar do Moe");
        int idade = 20;
        int quantidadePessoa = 1;

        //boolean acompanhado = quantidadePessoa >= 2;
        boolean acompanhado;

        if (quantidadePessoa >=2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }


        System.out.println("Valor de acompanhado e " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Voce pode comprar uma bebida");
        } else {
            System.out.println("Voce nao pode comprar bebida");
        }
    }
}
