import java.util.Scanner;
public class Demo020{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
       if(num%3==0 && num%5==0){
        System.out.println("fizzzzz-bizzzzz");
       }
       else if(num%5==0){
        System.out.println("bizzzzz");
       }
       else if(num%3==0){
         System.out.println("fizzzzz");
       }
       else{
        System.out.println("Not found");
       }
    }
}
    
