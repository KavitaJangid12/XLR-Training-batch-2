import java.util.Scanner; 
    public class Demo045 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println("Enter the a value: ");
            a = sc.nextInt();
            System.out.println("Enter the b value: ");
            b = sc.nextInt();
            System.out.println("before swapping:"+"a= "+a+" b= "+b);
            a = a + b;
            b = a - b;
            a = a-b;
            System.out.println("After Swapping:"+"a= "+a+" b= "+b);
        }
    }