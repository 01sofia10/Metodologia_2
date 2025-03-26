import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStack.main(new String[0]));
    }

    @Test
    void methodA() {
        assertDoesNotThrow(MethodCallStack::methodA);
    }

    @Test
    void methodB() {
        assertThrows(ArithmeticException.class, MethodCallStack::methodB);
    }

    @Test
    void methodC() {
        assertThrows(ArithmeticException.class, MethodCallStack::methodC);
    }

    @Test
    void methodD() {
        assertThrows(ArithmeticException.class, MethodCallStack::methodD);
    }
}