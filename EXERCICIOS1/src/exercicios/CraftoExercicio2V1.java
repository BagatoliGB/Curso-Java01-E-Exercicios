package EXERCICIOS1.src.exercicios;

public class CraftoExercicio2V1 {
    public static void main(String[] args) {
        boolean ligado = true;
        boolean desligado = false;
        // inserir false ou true para a validação.
        boolean pistao = true;

        if (pistao == ligado) {
            System.out.println("Aciona o Pistao " + pistao);
        } else {
            System.out.println("Pistao não acionado " + desligado);
        }

        System.out.println("situação atual do pistao é: " + pistao);
    }
}
