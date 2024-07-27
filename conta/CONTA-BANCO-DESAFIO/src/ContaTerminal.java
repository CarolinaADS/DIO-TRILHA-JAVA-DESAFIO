import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitar o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitar o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Simulação de saque - Primeiro cenário
        double saldoInicial = 25;
        double valorSolicitado = 18;
        System.out.println("\nSimulação de saque - Primeiro cenário:");
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Valor solicitado: " + valorSolicitado);

        // Verificação do saldo e processamento do saque
        if (saldoInicial > valorSolicitado) {
            saldoInicial -= valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldoInicial);

        // Simulação de saque - Novo cenário com entrada do usuário
        System.out.println("\nNovo cenário de saque:");

        // Solicitar saldo ao usuário
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        // Solicitar valor solicitado ao usuário
        System.out.print("Digite o valor solicitado: ");
        valorSolicitado = scanner.nextDouble();

        // Verificação do saldo e processamento do saque
        if (saldo > valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);

        scanner.close();
    }
}
