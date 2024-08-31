package TESTVARIALVELEFLUXO.src.variaveis.testeConversao;

public class Conversao {

    public static void main(String[] args) {
        
        double salario = 2700.50;
        int valor = (int)salario;
        System.out.println(valor);
        
        float pontoFlutuante = (float)3.14;

        int valor2 = 2000000000;
        long numeroGrande = 1231231231323231L;
        short numeroPequeno = 2100;
        byte mini = 127;
        System.out.println(valor2 + numeroGrande + numeroPequeno + mini + pontoFlutuante);
    }

}
