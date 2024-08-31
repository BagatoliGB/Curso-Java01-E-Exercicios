package JavaBank.contas;

public class TestaMetodo {
public static void main(String[] args) {
        Conta contaDoGustavo = new Conta();

        contaDoGustavo.saldo = 100;

        contaDoGustavo.deposita(70);
        System.out.println(contaDoGustavo.saldo);

        contaDoGustavo.saca(30);
        System.out.println(contaDoGustavo.saldo);

        contaDoGustavo.saca(200);
        System.out.println("O saldo do gustavo antes da tranferencia e " + contaDoGustavo.saldo);

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);

        System.out.println("o saldo da maria antes da tranferencai e " + contaDaMaria.saldo );

        contaDaMaria.transfere(3000, contaDoGustavo);

        System.out.println("saldo da maria depois da transferencia e " + contaDaMaria.saldo);
        System.out.println("saldo da gustavo depois da transferencia e " + contaDoGustavo.saldo);
    
    }
}
