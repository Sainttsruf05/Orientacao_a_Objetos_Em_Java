public class CadastroDeLivro {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        //Referençiamos o Autor do livro, (composição) com o autor daqui;
        livro.autor = autor;
        livro.aplicaDescontoDe(0.1);
        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paula.silveira@caelum.com.br";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        //Referençiamos o Autor do livro, (composição) com o autor daqui;
        outroLivro.autor = outroAutor;
        outroLivro.aplicaDescontoDe(0.5);
        outroLivro.mostrarDetalhes();


    }
}
