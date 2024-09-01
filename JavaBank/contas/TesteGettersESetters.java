package JavaBank.contas;

public class TesteGettersESetters {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.getNumero();
        conta.setNumero(12);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        conta.setTitular(cliente);
        cliente.setCPF("111.111.111-11");

        System.out.println(conta.getTitular().getCPF());
  
    }
}
