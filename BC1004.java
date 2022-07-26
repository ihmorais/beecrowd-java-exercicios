import java.util.Scanner;

public class BC1004 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int v1, v2, PROD;

        v1 = input.nextInt();
        v2 = input.nextInt();
        PROD = v1 * v2;

        System.out.println("PROD = " +  PROD);

        input.close();
    }
}
