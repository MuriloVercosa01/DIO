public class main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.exibirPagina("youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println("----------");
        meuIphone.atender();
        meuIphone.ligar("55 11 9 1234-56789");
        meuIphone.iniciarCorreioVoz();
        System.out.println("----------");
        meuIphone.selecionarMusica("Many Mens - 50 cents");
        meuIphone.tocar();
        meuIphone.pausar();
    }
}
