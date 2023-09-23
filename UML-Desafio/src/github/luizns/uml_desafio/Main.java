package github.luizns.uml_desafio;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Usando a função de Aparelho Telefonico");
        iphone.ligar("011987561234");
        iphone.atender();

        System.out.println("Usando a função Media Play");
        iphone.selecionarMusica("just the two of us");
        iphone.tocar();
        iphone.pausar();

        System.out.println("Usando a função Navegar na Internet");
        iphone.adicionarNovaAba("https://github.com/luizns");
        iphone.atualizarPagina();

    }
}
