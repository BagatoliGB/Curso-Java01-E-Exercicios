package JavaBank.contas;

//saldo. agencia, numero e titular.
public class Conta {

        //Getters and Setters, para encapsulamento de objetos
        private double saldo;
        private int agencia;
        private int numero;
        //abaixo ele irá pegar de uma outra classe criada as variaveis definido dentro da classe Cliente
        private Cliente titular;
     

        public void deposita(double valor){
                this.saldo += valor;
                //this.saldo = this.saldo + valor; mesma acao que a funcao acima
        }        

        public boolean saca(double valor){
                if(this.saldo >= valor){
                this.saldo -= valor;
                //this.saldo = this.saldo - valor;
                return true;
        } else {
                System.out.println("nao há saldo o suficiente, saque negado");
                return false;
        }
                
        
        }
        public boolean transfere(double valor, Conta destino){
                if(this.saldo >= valor){
                        this.saldo -= valor;
                        destino.deposita(valor);
                        System.out.println("O valor inserido esta dentro do permitido, a tranferencia foi realizada ");
                        return true;
                } else {
                        System.out.println("Como o valor de tranferencia é maior que: " + saldo + " entao nao é possivel realizar a tranferencia.");
                        return false;
                }
        }

        public double getSaldo(){
                return this.saldo;
        }

        public double getNumero(){
                return this.numero;
        }

        public void setNumero (int novoNumero){
                this.numero = novoNumero;
                if (novoNumero > 0){

                } else {
                        System.out.println("O numero da Conta não pode ser igual ou menor que zero");
                }
        }

        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }

}
