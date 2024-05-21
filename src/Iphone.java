public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        iphone1.ligar("8002 8922");
        iphone1.iniciarCorreioVoz();
        iphone1.selecionarMusica("Bring Me The Horizon - Shadow Moses");
        iphone1.tocar();
        iphone1.pausar();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("*Atendendo chamada*");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("*Iniciando correio de voz*");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("*Página exibida*");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("*Aba adicionada*");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("*Atualizando página*");
    }

    @Override
    public void tocar() {
        System.out.println("*Tocando música*");
    }

    @Override
    public void pausar() {
        System.out.println("*Pausando Música*");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Você selecionou a música: " + musica);
    }


}