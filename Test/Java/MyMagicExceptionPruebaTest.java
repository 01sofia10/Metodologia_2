import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMagicExceptionPruebaTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> MyMagicExceptionPrueba.main(new String[0]));
    }

    @Test
    void magic() {
        assertThrows(MyMagicException.class, () -> MyMagicExceptionPrueba.magic("Haz magic"));
        assertThrows(ArithmeticException.class, () -> MyMagicExceptionPrueba.magic("0"));
    }
}