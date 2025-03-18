import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 237.48;

        System.out.println("Bem vindo ao banco Principal");

        System.out.println("===============");

        System.out.println("Por favor, digite o número da conta e tecle ENTER: ");
        numero = scanner.nextInt();

        System.out.println("digite o número da agência com o hífen: ");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");

        nomeCliente = scanner.next();

        System.out.println("Olá, ".concat(nomeCliente)
                .concat("! Obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
