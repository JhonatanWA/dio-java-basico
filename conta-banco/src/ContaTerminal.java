import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
       
        int numero = 0;
        String agencia = "";
        String nome_cliente = "";
        double saldo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta bancária:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a agência da sua conta bancária:");
        agencia = scanner.nextLine();
        System.out.println("Digite o seu nome:");
        nome_cliente = scanner.nextLine();
        //Saldo não é obrigatório, se caso vier vazio entende-se que o saldo 123456
        System.out.println("Digite o saldo da sua conta bancária:");
        saldo = scanner.nextDouble();

        String respostaCadastro = cadastrarConta(numero, agencia, nome_cliente, saldo);

        System.out.println(respostaCadastro);
        
    }

    public static String cadastrarConta(int numero, String agencia, String nome_cliente, double saldo) 
    {
        String respostaConta = "";
        
        if (numero <= 0)   
            respostaConta += "Número de conta bancária obrigatório\n";
        if (agencia.isEmpty())   
            respostaConta += "Agência de conta bancária obrigatório\n";
        if (nome_cliente.isEmpty())
            respostaConta += "Nome do cliente de conta bancária obrigatório\n";
        
       
        if (respostaConta.isEmpty())
            respostaConta = "Conta cadastrada com sucesso\n";
            respostaConta += "Número da Conta: " + numero + "\n";
            respostaConta += "Agência da Conta: " + agencia + "\n";
            respostaConta += "Cliente da Conta: " + nome_cliente + "\n";
            respostaConta += "Saldo da Conta: R$" + String.format("%.2f", saldo);

        return respostaConta;
    }
}