public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        String musica = "Terno Rei - Solidão de Volta";
        iphone.tocar(musica);
        iphone.pausar(musica);
        iphone.selecionarMusica(musica);
    }
}
