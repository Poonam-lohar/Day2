import java.util.Scanner;
public class ForLoopReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n= ");
        int n = sc.nextInt();
        int reverse=0;
        while (n !=0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
            System.out.println("Reverse number is: "+reverse);
        }
    }
