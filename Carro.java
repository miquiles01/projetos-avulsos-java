public class Carro {
    String modelo;
    int ano;

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2020;

        meuCarro.exibirInformacoes();
    }
}
