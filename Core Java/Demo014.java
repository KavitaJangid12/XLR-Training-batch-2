public class Demo014{
    public static void main(String[] args) {
        int a = 2;
        int u1 = a++;
        System.out.println("Unary output for a++: "+u1);
        int u2 = ++a;
        System.out.println("Unary output for ++a: "+u2);
        int u3 = a--;
        System.out.println("Unary output for a--: "+u3);
        int u4 = --a;
        System.out.println("Unary output for --a: "+u4);
    }
}