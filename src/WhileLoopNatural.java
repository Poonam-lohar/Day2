import java.util.Scanner;

public class WhileLoopNatural {
    public static void main(String[] args)
    {
        int x,i=1;
        int sum=0;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        while (i<=x)
        {
            System.out.print(" " +i);
            sum = sum+i;
            i++;
        }
        System.out.println("   Sum of natural numbers: " +sum);
    }
}
