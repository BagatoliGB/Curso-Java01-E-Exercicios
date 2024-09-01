package JavaBank.contas;

public class TestaMetodo {
public static void main(String[] args) {
        Conta contaDoGustavo = new Conta();

        contaDoGustavo.deposita(100);

        contaDoGustavo.deposita(70);
        System.out.println(contaDoGustavo.getSaldo());

        contaDoGustavo.saca(30);
        System.out.println(contaDoGustavo.getSaldo());

        contaDoGustavo.saca(200);
        System.out.println("O saldo do gustavo antes da tranferencia e " + contaDoGustavo.getSaldo());

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);

        System.out.println("o saldo da maria antes da tranferencai e " + contaDaMaria.getSaldo());

        contaDaMaria.transfere(3000, contaDoGustavo);

        System.out.println("saldo da maria depois da transferencia e " + contaDaMaria.getSaldo());
        System.out.println("saldo da gustavo depois da transferencia e " + contaDoGustavo.getSaldo());
    
        
    }
}
