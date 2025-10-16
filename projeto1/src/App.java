import atividadeLivro.Livro;


public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("50 tons de java" , "Barry A. Burd" , 2006 , 300);
        livro.exibirInformacoes();
    }
}
