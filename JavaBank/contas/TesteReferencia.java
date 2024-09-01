package JavaBank.contas;

public class TesteReferencia {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta ();
       primeiraConta.deposita(300);

       System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());

      // Conta segundaConta = primeiraConta;
        Conta segundaConta = new Conta();
        segundaConta.deposita(300); 

       System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());

       segundaConta.deposita(100);
       System.out.println("O saldo agora da segunda conta é: " + segundaConta.getSaldo());

       System.out.println("O saldo agora da primeira conta é: " + primeiraConta.getSaldo());

       if(primeiraConta == segundaConta){
        System.out.println("São a mesma conta");

       } else{
        System.out.println("A primeira e a segunda conta nao sao a mesma coisa");
       }
    }
}
