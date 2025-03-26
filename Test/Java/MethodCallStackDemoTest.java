import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStackDemo.main(new String[0]));
    }

    @org.junit.jupiter.api.Test
    void methodA() {
        assertDoesNotThrow(MethodCallStackDemo::methodA);
    }

    @org.junit.jupiter.api.Test
    void methodB() {
        assertDoesNotThrow(MethodCallStackDemo::methodB);
    }

    @org.junit.jupiter.api.Test
    void methodC() {
        assertThrows(ArithmeticException.class, () -> MethodCallStackDemo.methodC(true));
        assertDoesNotThrow(() -> MethodCallStackDemo.methodC(false));
    }
}