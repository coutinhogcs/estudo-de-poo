public class Carro {
//Crie uma classe Carro com atributos modelo, ano,
// cor e métodos para exibir a ficha técnica e calcular a idade do carro.
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("** Venda de Carros **");
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano do carro: "+ ano );
        System.out.println("Cor" + cor);
        System.out.println("***********************");
    }

    int calculaIdade(){
        return 2024 - ano;
    }
}
