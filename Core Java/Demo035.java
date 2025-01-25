import java.util.Scanner;
public class Demo035{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+"is bigger one");
        }
        else if(a<b){
            System.out.println(b+"is bigger one");
        } else{
            System.out.println("Both are equal");
        }
    }
}