import java.util.Scanner;
public class Demo037{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter n3: ");
        int n3 = sc.nextInt();
        System.out.println("Enter n4: ");
        int n4 = sc.nextInt();

        

       if(n1>n2 && n1>n3 && n1>n4){
        System.out.println(n1+"is big");
       } else if(n2 >n1 && n2>n3 && n2>n4){
        System.out.println(n2+"is big");
       } else if(n3>n1 && n3>n2 && n3>n4){
        System.out.println(n3+"is big");
       } else{
        System.out.println(n4+"is big");
       }
}
}