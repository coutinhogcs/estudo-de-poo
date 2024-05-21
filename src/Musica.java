public class Musica {
      String titulo;
      String artista;
      int anoLancamento;
      double somaAvaliacoes;
      int numeroAvaliacao;

      void fichaTecnica(){
          System.out.println("Conhecendo a música. Tipo: " + titulo);
          System.out.println("Nome do artista: " + artista);
          System.out.println("Ano de lançamento: "+ anoLancamento);
      }
      void avalia(double nota){
          somaAvaliacoes += nota;
          numeroAvaliacao++;
      }

      double pegaMedia(){
          return somaAvaliacoes/numeroAvaliacao;
      }
}