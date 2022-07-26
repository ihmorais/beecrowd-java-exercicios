import java.util.Scanner;

public class BC1014 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int X;
        double consumoMedio, Y;

        X = input.nextInt();
        Y = input.nextDouble();

        consumoMedio = X / Y;

        System.out.printf("%.3f km/l\n", consumoMedio);

        input.close();
    }
}
