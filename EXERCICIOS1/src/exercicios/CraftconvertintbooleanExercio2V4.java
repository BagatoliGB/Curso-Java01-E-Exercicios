package EXERCICIOS1.src.exercicios;

import java.util.Scanner;

public class CraftconvertintbooleanExercio2V4 {
    public static String alerta = ("Algum Numero inserido abaixo nao entra na validacão sendo assim o Pistao não terá comando ou ação, Insert: 1 to (ON) OR 0 to (OFF) ");
    {
    }

    public static boolean binary() {
        // Inserir 0 ou 1 para a validacao true;
        // se for inserido um numero != retornará false e terá que inserir o numero novamente;
        Scanner scan = new Scanner(System.in);
        // 1 define que a funcao esta sendo executada para a variavel e 0 nao.
        int ativado = scan.nextInt();
        int comandoEmpurrar = scan.nextInt();

        scan.close();

        System.out.println("Foi inserido o numero " + ativado + " para ativado");
        System.out.println("Foi inserido o numero " + comandoEmpurrar + " Comando para empurrar");

        // Se o pistao tiver desativado e com comando para empurrar podera efetuar a
        // ação
        if (ativado == 0 && comandoEmpurrar == 1) {
            System.out.println("Acionado o Pistao para (Empurrar) ficando ativo ");
            return true;
        }
        // Se o pistao não esta ativo e não esta para empurrar ficará desativado
        if (ativado == 0 && comandoEmpurrar == 0) {
            System.out.println("O Pistão continuara desativado sem empurrar ");
            return true;
        }
        // Se o pistao tiver ligado e teve e nao teve comando para Retrair permanecerã como esta
        if (ativado == 1 && comandoEmpurrar == 0) {
            System.out.println("O Pistão estava ativo e não teve comando para empurar sendo assim continuará ativo ");
            return true;
        }
        // Se o pistao tiver o comando de empurrar com o pistão ativo ele volta para
        // desligado já que recebe sinal de açao.
        if (ativado == 1 && comandoEmpurrar == 1) {
            System.out.println("O Pistão irá retrair pois já estava ativo ");
            return true;
        }
        if (ativado > 1 || ativado < 0) {
            return false;
        }
        if (comandoEmpurrar > 1 || comandoEmpurrar < 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out
                .println("Insira os valores da situação ativado e empurrando, sendo 1 True e 0 para False");

        boolean ativado = true;
        boolean binary = binary();
        String alerta1 = alerta;

        if (ativado != binary) {
            System.out.println(alerta1);
        }
    }
}
