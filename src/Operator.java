import java.util.Scanner;
public class Operator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number= ");
            int a = sc.nextInt();
            System.out.print("enter number= ");
            int b = sc.nextInt();
            System.out.println("max= " + Math.max(a, b));
            System.out.println("min= " + Math.min(a, b));
            System.out.print("enter number= ");
            int c = sc.nextInt();
            int p = 0;
            p = a + b * c;
            System.out.println("p = " + p);
            p = c + a / b;
            System.out.println("p= " + p);
            p = a % b + c;
            System.out.println("p = " + p);
            p = a * b + c;
            System.out.println("p = " + p);
        }
    }
