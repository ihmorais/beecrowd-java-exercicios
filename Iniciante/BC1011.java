import java.util.Scanner;

public class BC1011 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double raio, volume, pi = 3.14159;

        raio = input.nextInt();

        volume = (4.0 / 3) * pi * (raio*raio*raio);

        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }
}
