package principal;

public class TesteException {
    public static void metodo1() {
        System.out.println("Início do metodo1.");
        int[] vetor = new int[5];
        try {
            for (int i = 0; i < 10; i++) {
                vetor[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: Índice fora dos limites do vetor.");
        }
        System.out.println("Fim do metodo1.");
    }

    public static void main(String[] args) {
        System.out.println("Início da main.");
        metodo1();
        System.out.println("Fim da main.");
    }
}
