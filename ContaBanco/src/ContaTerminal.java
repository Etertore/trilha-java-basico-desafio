import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 2376.48;

        System.out.println("Bem-vindo ao banco Principal");

        System.out.println("============================");

        System.out.println("Por favor, digite o número da conta: ");
        System.out.println("(depois ENTER para o próximo campo)");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        System.out.println("(depois ENTER para o próximo campo)");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Olá, ".concat(nomeCliente)
                .concat("! Obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
