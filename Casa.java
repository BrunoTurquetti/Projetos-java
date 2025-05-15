// Definição da classe Casa
public class Casa {

    // Atributo que armazena o endereço da casa
    private String endereco;

    // Atributo que representa o número de quartos na casa
    private int numeroDeQuartos;

    // Atributo que representa o número de banheiros na casa
    private int numeroDeBanheiros;

    // Atributo que indica se as luzes estão acesas
    private boolean luzesAcesas;

    // atributos com os valores passados
    public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeBanheiros = numeroDeBanheiros;
    }


    // Método que exibe as informações da casa no console
    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Quartos: " + numeroDeQuartos);
        System.out.println("Número de Banheiros: " + numeroDeBanheiros);
    }


    /* Método principal (main) que cria um objeto da classe
 Casa e chama o método para exibir informações */
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("123 Rua Alegre", 3, 2); // Criação do objeto 'minhaCasa'
        minhaCasa.exibirInformacoes(); // Exibe as informações da casa no console
}
}