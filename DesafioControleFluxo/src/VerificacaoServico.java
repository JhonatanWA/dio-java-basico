import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço ser verificado: \n");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o seu nome e os serviços contratados: \n");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        if (verificarServico(partes, servico)) {
            contratado = true;
        }

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        
        scanner.close();
    }

    static boolean verificarServico(String[] partes, String servico) {
        String [] servicosDisponiveis = {"movel", "fixa", "banda larga", "tv"};

        for (String serv : partes) {
            if (Arrays.asList(servicosDisponiveis).contains(serv)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }       
}