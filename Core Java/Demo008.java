import java.util.Scanner;
public class Demo008{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = null; 
        String pwd = null;
        String reply;
        do { 
            System.out.println("Hello user!");
            System.out.println("Have you visited our site earlier?");
            reply = sc.nextLine();
            if(reply == "no"){
                System.out.println("Login here...");
                System.out.println("Enter your id and pwd:");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valid customer");
            }

        } while ((loginid == "kavita") && (pwd == "1205")); 
        
    }
}

