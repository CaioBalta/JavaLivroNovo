public class Estoque {
    private Livro[] livros;
    private int contador;

    public Estoque() {
        livros = new Livro[100]; 
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].pegarCodigoBar().equals(livro.pegarCodigoBar())) {
                livros[i].atualizaQuant(livros[i].pegarQuant() + livro.pegarQuant());
                System.out.println("Quantidade atualizada para o livro com código de ISBN: " + livro.pegarCodigoBar());
                return;
            }
        }

        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado: " + livro.pegarTitulo());
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais livros.");
        }
    }

    public void removerLivro(String codigoBar) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].pegarCodigoBar().equals(codigoBar)) {
                System.out.println("Removendo livro: " + livros[i].pegarTitulo());
                livros[i] = livros[contador - 1]; 
                livros[contador - 1] = null; 
                contador--;
                return;
            }
        }
        System.out.println("Livro com ISBN " + codigoBar + " não encontrado.");
    }

    public Livro buscarLivro(String codigoBar) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].pegarCodigoBar().equals(codigoBar)) {
                return livros[i];
            }
        }
        System.out.println("Livro com ISBN " + codigoBar + " não encontrado.");
        return null;
    }

    public void listarLivros() {
        if (contador == 0) {
            System.out.println("Estoque vazio.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(livros[i]);
            }
        }
    }

    public void atualizarQuantidade(String codigoBar, int quantidade) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].pegarCodigoBar().equals(codigoBar)) {
                livros[i].atualizaQuant(quantidade);
                System.out.println("Quantidade atualizada para o livro com ISBN " + codigoBar);
                return;
            }
        }
        System.out.println("Livro com ISBN " + codigoBar + " não encontrado.");
    }
}
