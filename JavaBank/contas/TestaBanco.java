package JavaBank.contas;

public class TestaBanco{
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.getNome("Gustavo");
        gustavo.getCPF("111.111.111-11");
        gustavo.getProfissao("Suporte");

        Conta contaDoGustavo = new Conta();
        contaDoGustavo.deposita(100);

        
    }
}

