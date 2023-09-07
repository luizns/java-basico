import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: 5");
        int parametroDois = terminal.nextInt();

        try {

            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.err.println("O primeiro parâmetro não pode ser maior ou igual ao segundo parâmetro.");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}
