public class Iphone implements  MediaPlayer, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz...");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("tocando: " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println("musica " + musica + " pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("musica selecionada: " + musica);
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina...");
    }
}
