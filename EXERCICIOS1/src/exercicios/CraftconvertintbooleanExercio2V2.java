package EXERCICIOS1.src.exercicios;

public class CraftconvertintbooleanExercio2V2 {
    public static boolean binary() {
        // Inserir 0 ou 1 para a validacao, se num for != retorna como 0;
        int ligado = 0;

        if (ligado == 1) {
            return true;
        }
        if (ligado == 0) {
            return false;
        } else {
            System.out.println(
                    "Esse numero nao entra na validacao sendo irá retornar False como 0, Insert: 1 to (ON) OR 0 to (OFF) ");
            return false;
        }
    }

    public static void main(String[] args) {

        boolean ativado = true;
        boolean desativado = false;
        boolean pistao = binary();
        boolean binary = binary();

        if (ativado = binary) {
            System.out.println("Aciona o Pistao para ligado " + ativado);
        } else {
            System.out.println("Aciona o Pistao para Desligado " + desativado);
        }

        System.out.println("Situação do pistao: " + pistao);

    }
}
