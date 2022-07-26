import java.util.Scanner;

public class BC1008 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int workerId, hoursWorked;
        double hourlyWage, salary;

        workerId = input.nextInt();
        hoursWorked = input.nextInt();
        hourlyWage = input.nextDouble();

        salary =  hourlyWage * hoursWorked;

        System.out.println("NUMBER = " + workerId);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        input.close();
    }
}
