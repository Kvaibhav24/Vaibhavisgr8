import java.util.Scanner;
public class Practical_2 {

    public static void main(String[] args) {
        System.out.println("Tanishq Gupta 2102280 IT-C2 5th sem");
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}