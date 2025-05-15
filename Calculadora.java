public class Calculadora {
    int numero1;
    int numero2;

    public Calculadora(int numero1Arg, int numero2Arg) {
        numero1 = numero1Arg;
        numero2 = numero2Arg;
    }

    public int somar() {
        return numero1 + numero2;
    }

    public void mostrarResultados() {
        System.out.println("Adição de " + numero1 + " + " + numero2 + " = " + somar());
    }

    public static void main(String args[]) {
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);

        Calculadora calculadora = new Calculadora(numero1, numero2);

        calculadora.mostrarResultados();
    }
}
