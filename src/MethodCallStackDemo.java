public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        System.out.println("Enter methodB()");
        try {
            methodC(true);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Exit methodB()");
    }
    public static void methodC(boolean error) throws ArithmeticException{
        System.out.println("Enter methodC()");
        if (error) {
            System.out.println(1 / 0); // divide-by-0 triggers an ArithmeticException
        }
        System.out.println("Exit methodC()");
    }
}
