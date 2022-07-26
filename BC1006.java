import java.util.Scanner;

public class BC1006 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double A, B, C, pesoA, pesoB, pesoC, MEDIA;
        pesoA = 2;
        pesoB = 3;
        pesoC = 5;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        MEDIA = (pesoA*A + pesoB*B + pesoC*C) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        input.close();
    }
}
