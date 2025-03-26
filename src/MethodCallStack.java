public class MethodCallStack {
    public static void main(String[] args) {
        System.out.println("main");
        methodA();
    }
    public static void methodA() {
        try {
            System.out.println("A");
            methodB();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void methodB() throws ArithmeticException {
        System.out.println("B");
        methodC();
    }
    public static void methodC() throws ArithmeticException{
        System.out.println("C");
        methodD();
    }
    public static void methodD() throws ArithmeticException{
        System.out.println("D");
        System.out.println(1/0);
    }
}
