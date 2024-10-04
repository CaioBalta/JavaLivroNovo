public class Livro {
    private String titulo;
    private String autor;
    private String codigoBar;
    private int quantidade;

    public Livro(String titulo, String autor, String codigoBar, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoBar = codigoBar;
        this.quantidade = quantidade;
    }

    public String pegarCodigoBar() {
        return codigoBar;
    }

    public String pegarTitulo() {
        return titulo;
    }

    public String pegarAutor() {
        return autor;
    }

    public int pegarQuant() {
        return quantidade;
    }

    public void atualizaQuant(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro Título: " + titulo + ",\n Autor: " + autor + ",\n ISBN: " + codigoBar + ",\n Quantidade: " + quantidade;
    }
}

