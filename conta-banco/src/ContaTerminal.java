import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("\n\nPor favor, digite o número da Agência !");

        System.out.print("Agência: ");
        conta.setCodigoAgencia(sc.nextLine());

        System.out.print("Usuário: ");
        conta.setNomeCliente(sc.nextLine());

        System.out.print("Numero:  ");
        conta.setNumeroDaConta(sc.nextInt());

        System.out.print("Saldo: ");
        conta.setSaldoDaConta(sc.nextDouble());

        String disponivel = "";

        if (conta.getSaldoDaConta() > 0.0) {
            disponivel = String.format("seu saldo %.2f já está disponível para saque. ", conta.getSaldoDaConta());
        } else {
            disponivel = String.format("seu saldo %.2f você está sem limites para saque. ",
                    conta.getSaldoDaConta());

        }

        String cadastroCliente = String.format("Olá %s, obrigado por criar uma conta em nosso banco,"
                + "sua agência é %s, conta %d e ", conta.getNomeCliente(),
                conta.getCodigoAgencia(), conta.getNumeroDaConta()).concat(disponivel);

        System.out.println("\n"+cadastroCliente+"\n");
        sc.close();
    }
}
