import java.util.Scanner;
public class ReadNumber {
   public static void main(String[] args) {
       int n = 0;
       int hundreds = 0;
       int tens = 0;
       int one = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a 3 digit number");
       int number = sc.nextInt();
       one = number%10;
       tens = number% 100-one;
       hundreds = number%1000-tens-one;
       System.out.println(one);
       System.out.println(tens);
       System.out.println(hundreds);
   }
   }