import java.util.Scanner;
public class Demo017{
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        sum = (a/10) + (a % 10);
        System.out.println("The sum of entered digits: "+sum);

    }
}