import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    static String nome;
    static int posicao;

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantas pessoas você quer ter nessa lista?");
            int quantidade = sc.nextInt();

            List<String> lista = new ArrayList<>(quantidade);

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o nome da pessoa numero " + (1 + i));
                nome = sc.next();
                lista.add(nome);
            }

            System.out.println("Digite o valor da posição para consultar o nome armazenado na mesma: ");
            posicao = sc.nextInt();

            System.out.println("Na posição " + posicao + " está armazenado o nome: " + lista.get(posicao));

        } catch (InputMismatchException e) {
            System.out.println("Uma letra foi inserida no lugar de um número. Não foi possível continuar o programa.\n" +
                    "Reinicie tudo!");

        }
    }
}

