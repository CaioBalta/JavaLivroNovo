public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Livro livro1 = new Livro("Java Básico", "Autor A", "12345", 10);
        Livro livro2 = new Livro("Estruturas de Dados", "Autor B", "67890", 5);

        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);

        estoque.listarLivros();

        estoque.atualizarQuantidade("12345", 15);

        Livro buscado = estoque.buscarLivro("12345");
        if (buscado != null) {
            System.out.println("Livro encontrado: " + buscado);
        }

        estoque.removerLivro("67890");
        estoque.listarLivros();

    }
}
