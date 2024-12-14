import interfaces.Aparelho_Telefonico;
import interfaces.Navegador_Internet;
import interfaces.Reprodutor_Musical;

public class Iphone implements Aparelho_Telefonico, Navegador_Internet, Reprodutor_Musical {
    private int ano;
    private int modelo;

    public Iphone(int ano, int modelo) throws ModeloException {
        if (modelo < 1 || modelo > 16) {
            throw new ModeloException();
        }
        else {
            this.ano = ano;
            this.modelo = modelo;
        }
        
    }
    
    public int getModelo() {
        return this.modelo;
    }
    
    public int getAno() {
        return this.ano;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página de url: " + url);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
}
