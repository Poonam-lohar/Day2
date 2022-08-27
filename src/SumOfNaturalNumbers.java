import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        {
            int i , sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            for (i = 1; i <= a; i++) {
                System.out.print(i);
                System.out.print("+");
                sum = sum + i;
            }
            System.out.println("sum is: "+sum);
        }
    }
}
