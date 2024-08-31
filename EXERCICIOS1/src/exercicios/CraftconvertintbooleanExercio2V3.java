package EXERCICIOS1.src.exercicios;

public class CraftconvertintbooleanExercio2V3 {
    public static String alerta = ("Esse numero nao entra na validacao sendo assim o Pistao não terá comando ou ação, Insert: 1 to (ON) OR 0 to (OFF) ");
    {
    }

    public static boolean binary() {
        // Inserir 0 ou 1 para a validacao true;
        // se for inserido um numero != retornará false e terá que inserir o numero novamente;
        int ligado = 0;

        System.out.println("Foi inserido o numero " + ligado);

        //Se o pistao tiver ligado e Retraido ele Empurrará
        if (ligado == 1) {
            System.out.println("Acionado o Pistao para ligado (Empurrar) ");
            return true;
        }
        //Se o pistao tiver desligado e estava empurrando ele irá Retrair
        if (ligado == 0) {
            System.out.println("Acionado o Pistao para Desligado (Retrair) ");
            return true;
        }
        if (ligado > 1 || ligado < 0) {
            return false;}

        else {
            System.out.println("Como o Pistao não esta Ativo não poderá ser Retraido ");
            return false;
        }
    }

    public static void main(String[] args) {

        boolean ativado = true;
        boolean binary = binary();
        String alerta1 = alerta;

        if (ativado != binary) {
            System.out.println(alerta1);
        }
    }

}
