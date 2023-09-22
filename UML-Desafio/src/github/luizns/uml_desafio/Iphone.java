package github.luizns.uml_desafio;

public class Iphone implements SmartphoneDevice {

    private boolean estaTocando;
    private String musicaAtual;
    private boolean estaChamando;
    private boolean correioVozAtivo;
    private String urlAtual;


    @Override
    public void ligar(String numero) {
        estaChamando = true;
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        estaChamando = false;
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        correioVozAtivo = true;
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + urlAtual);
    }

    @Override
    public void tocar() {
        estaTocando = true;
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        estaTocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        musicaAtual = nomeDaMusica;
        System.out.println("Selecionando música: " + nomeDaMusica);
    }
}
