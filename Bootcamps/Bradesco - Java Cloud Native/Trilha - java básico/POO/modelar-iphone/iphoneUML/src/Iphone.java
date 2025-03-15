public class Iphone implements AparelhoTelefonico , NavegadorNaInternet , ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música..");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("música selecionada: "+ musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo página: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba..");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página..");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para o número: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("reproduzindo correio de voz...");
    }

}
