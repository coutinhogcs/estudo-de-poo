public class Discografia {
    public static void main(String[] args) {
        Musica autor = new Musica();

        autor.artista ="Belo";
        autor.titulo= "Pagode";
        autor.anoLancamento = 1990;
        autor.fichaTecnica();


        autor.avalia(10);
        autor.avalia(8.9);
        autor.avalia(5.5);
        autor.avalia(7.8);

        System.out.println("O número de avalições foi de: " + autor.numeroAvaliacao+ ". A média de todas as avaliações é igual: " + autor.pegaMedia());
    }
}
