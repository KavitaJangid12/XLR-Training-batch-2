import java.util.Scanner;
public class Demo034{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}