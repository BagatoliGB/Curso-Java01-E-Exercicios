package JavaBank.contas;

public class TestaBanco{
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.nome = "Gustavo";
        gustavo.CPF = "111.111.111-11";
        gustavo.profissao = "Suporte";

        Conta contaDoGustavo = new Conta();
        contaDoGustavo.deposita(100);
        
    }
}

