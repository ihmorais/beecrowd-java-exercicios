import java.util.Scanner;

public class BC1009 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String name;
        double fixedIncome, commissionRevenue, salaryWithComission;
        double bonus = 15;

        name = input.next();
        fixedIncome = input.nextDouble();
        commissionRevenue = input.nextDouble();

        salaryWithComission = ((commissionRevenue * bonus) / 100) + fixedIncome;

        System.out.printf("TOTAL = R$ %.2f\n", salaryWithComission);

        input.close();
    }
}
