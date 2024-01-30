public class Livro{
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;//composição: uma classe como atributo;
    void mostrarDetalhes(){
        String mensagem = "Detalhes do livro";
        System.out.println(mensagem);
        System.out.println(STR."Titulo: \{nome}");
        System.out.println(STR."Descrição: \{descricao}");
        System.out.println(STR."Valor: \{valor}");
        System.out.println(STR."ISBN: \{isbn}");
        autor.mostrarDetralhes();
        System.out.println("----");
    }
    public void aplicaDescontoDe(double valor){
        valor -= this.valor * valor;
    }
}
