import java.util.Scanner;
public class VowelConsonent {
        public static void main(String[] args)
        {
            boolean vowel = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter character: ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case'a':
                    System.out.println(ch+ " is vowel");
                    break;
                case'e':
                    System.out.println(ch+ " is vowel");
                    break;
                case'i':
                    System.out.println(ch+ " is vowel");
                    break;
                case'o':
                    System.out.println(ch+ " is vowel");
                    break;
                case'u':
                    System.out.println(ch+ " is vowel");
                    break;
                case'A':
                    System.out.println(ch+ " is vowel");
                    break;
                case'E':
                    System.out.println(ch+ " is vowel");
                    break;
                case'I':
                    System.out.println(ch+ " is vowel");
                    break;
                case'O':
                    System.out.println(ch+ " is vowel");
                    break;
                case'U':
                    System.out.println(ch+ " is vowel");
                    break;
                default:
                    System.out.println(ch+ " is consonent");
                    break;
            }
        }
}
