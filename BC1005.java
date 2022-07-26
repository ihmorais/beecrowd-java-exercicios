import java.util.Scanner;

public class BC1005 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double A, B, pesoA, pesoB, MEDIA;

        pesoA = 3.5;
        pesoB = 7.5;

        A = input.nextDouble();
        B = input.nextDouble();

        MEDIA = ((pesoA*A) + (pesoB*B))/ (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        input.close();
    }
}
