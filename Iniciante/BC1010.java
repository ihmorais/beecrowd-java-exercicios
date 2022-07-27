import java.util.Scanner;

public class BC1010 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int id1, id2, qtd1, qtd2;
        double precoUnidade1, precoUnidade2, total;

        id1 = input.nextInt();
        qtd1 = input.nextInt();
        precoUnidade1 = input.nextDouble();

        id2 = input.nextInt();
        qtd2 = input.nextInt();
        precoUnidade2 = input.nextDouble();

        total = precoUnidade1 * qtd1 + precoUnidade2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        input.close();
    }
}
