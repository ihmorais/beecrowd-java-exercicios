import java.util.Scanner;

public class BC1013 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int v1, v2, v3, maiorAB, maiorC;

        v1 = input.nextInt();
        v2 = input.nextInt();
        v3 = input.nextInt();

        maiorAB = (v1 + v2 + Math.abs(v1-v2))/2;
        maiorC = (maiorAB + v3 + Math.abs(maiorAB - v3))/2;

        System.out.println(maiorC + " eh o maior");

        input.close();
    }
}
