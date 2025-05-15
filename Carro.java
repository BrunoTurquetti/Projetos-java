public class Carro {

   String modelo;
   String cor;
   int ano;

public Carro(String modelo, String cor, int ano) {
 
   this.modelo = modelo;
   this.cor = cor;
   this.ano = ano;
}

public void exibirInformacoes() {

    System.out.println("Modelo: " + modelo);
    System.out.println("Cor: " + cor);
    System.out.println("ano: " + ano);
}

public static void main(String[] args) {

     Carro primeiroCarro = new Carro("Civic", "Preto", 2012);
     Carro segundoCarro = new Carro("Peugeot", "Prata", 2025);
     Carro terceiroCarro = new Carro("Onix", "Azul Escuro", 2022);

     
     primeiroCarro.exibirInformacoes();
     segundoCarro.exibirInformacoes();
     terceiroCarro.exibirInformacoes();
   }
}