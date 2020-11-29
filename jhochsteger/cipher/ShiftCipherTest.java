package jhochsteger.cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShiftCipherTest {
    @Test
    public void ShiftCipherTest_setSecretAlphabet_true() {
        String cipher = "fghijklmnopqrstuvwxyzäöüßabcde";
        ShiftCipher shiftCipher = new ShiftCipher(5);
        assertEquals(cipher, shiftCipher.getSecretAlphabet());
    }

    @Test
    public void ShiftCipherTest_setSecretAlphabet_false() {
        String cipher = "abcdefghijklmnopqrstuvwxyzäöüß";
        ShiftCipher shiftCipher = new ShiftCipher(5);
        assertNotEquals(cipher, shiftCipher.getSecretAlphabet());
    }

    @Test
    public void ShiftCipherTest_setSecretAlphabet_negative() {
        String cipher = "abcdefghijklmnopqrstuvwxyzäöüß";
        ShiftCipher shiftCipher = new ShiftCipher(-5);
        assertEquals(cipher, shiftCipher.getSecretAlphabet());
    }

    @Test
    public void ShiftCipherTest_setSecretAlphabet_big() {
        String cipher = "uvwxyzäöüßabcdefghijklmnopqrst";
        ShiftCipher shiftCipher = new ShiftCipher(50);
        assertEquals(cipher, shiftCipher.getSecretAlphabet());
    }
}
