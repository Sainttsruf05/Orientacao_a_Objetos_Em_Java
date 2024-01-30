public class ComparandoReferencia {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodigo Turini";

        Autor outroAutor = new Autor();
        outroAutor.nome = "Rodrigo Turini";

        if (autor == outroAutor){
            System.out.println("Iguas, mesmo autor");
        } else {
            System.out.println("hein, Por que diferentes?");
        }
    }
}
