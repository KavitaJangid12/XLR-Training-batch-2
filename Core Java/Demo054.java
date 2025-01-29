class Cal{
    void add(int a1, int a2){
        System.out.println("The sum of two numbers is: "+(a1+a2));
    }
    void add(double a1, double a2, double a3){
        System.out.println("The sum of three numbers is: "+(a1+a2+a3));
    }
}
public class Demo054{
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add(1,3);
        c.add(2.1,3.0,4.0);
    }
}