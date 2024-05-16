package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas <3);
            if(atendeu){
                System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
            }
            else{
                System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
            }

    }

    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(String candidato : candidatos){
            System.out.println();

        }
    }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + ", solicitou esse valor de salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O condidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O condidato " + candidato + " foi reprovado para a vaga");
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioPretendido == salarioBase){
            System.out.println("LIGAR COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDAR DEMAIS CANDIDATOS");
        }
    }
}
