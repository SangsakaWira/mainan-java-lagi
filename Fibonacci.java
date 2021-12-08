import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit= scanner.nextInt();
        int past = 1;
        int current = 1;
        int fibonacci = 1;
        for (int i =1; i <= limit; i++){
            System.out.print(current + ", ");
            fibonacci = past + current;
            past = current;
            current = fibonacci;
        }
        System.out.println("");
        scanner.close();
    }
}
