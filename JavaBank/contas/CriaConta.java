package JavaBank.contas;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo + " reias.");

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta = " + primeiraConta.saldo);
        System.out.println("segunda conta = " + segundaConta.saldo);

        System.out.println(segundaConta.agencia);
    }
}
