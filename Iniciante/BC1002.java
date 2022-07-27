import java.util.Scanner;

public class BC1002 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double n = 3.14159;
        double raio, area;

        raio = input.nextDouble();
        area = n * (raio*raio);

        System.out.printf("A=%.4f\n", area);
        input.close();
    }
}
