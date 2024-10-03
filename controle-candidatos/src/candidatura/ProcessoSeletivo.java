package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ProcessoSeletivo
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"Jhonatan", "João", "Maria", "Pedro", "Tiago"};

        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {

            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa de contato.");
        } else {
            System.out.println("Não conseguimos contato com o candidato "+ candidato + " número máximo de tentativas realizadas: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Jhonatan", "João", "Maria", "Pedro", "Tiago"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Jhonatan", "João", "Maria", "Pedro", "Tiago"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) { 
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}