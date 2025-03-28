import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcepcionesTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> Excepciones.main(new String[0]));
    }

    @Test
    void ex1() {
        assertThrows(ArrayIndexOutOfBoundsException.class, Excepciones::ex1);
    }

    @Test
    void ex2() {
        assertThrows(NullPointerException.class, Excepciones::ex2);
    }

    @Test
    void ex3() {
        assertThrows(NumberFormatException.class, Excepciones::ex3);
    }

    @Test
    void ex4() {
        assertThrows(ClassCastException.class, Excepciones::ex4);
    }

    @Test
    void ex5() {
        assertThrows(IllegalArgumentException.class, Excepciones::ex5);
    }

    @Test
    void ex6() {
        assertThrows(IllegalStateException.class, Excepciones::ex6);
    }

    @Test
    void ex7() {
        assertThrows(NoClassDefFoundError.class, Excepciones::ex7);
    }
}