package jhochsteger.cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubstitutionCipherTest {

    @Test
    public void SubstitutionCipher_setSecretAlphabet_true() {
        String cipher = "ßüöäzyxwvutsrqponmlkjihgfedcba";
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(cipher);
        assertEquals(cipher, substitutionCipher.getSecretAlphabet());
    }

    @Test
    public void SubstitutionCipher_setSecretAlphabet_false() {
        String cipher = "ßüöäzyxwvutsrqponmlkjihgfedcbx";
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(cipher);
        assertNotEquals(cipher, substitutionCipher.getSecretAlphabet());
    }

    @Test
    public void MonoAlphabeticCipher_encrypt() {
        String cipher = "ßüöäzyxwvutsrqponmlkjihgfedcba";
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(cipher);
        assertEquals("wßssp!", substitutionCipher.encrypt("Hallo!"));
    }

    @Test
    public void MonoAlphabeticCipher_decrypt() {
        String cipher = "ßüöäzyxwvutsrqponmlkjihgfedcba";
        SubstitutionCipher substitutionCipher = new SubstitutionCipher(cipher);
        assertEquals("hallo!", substitutionCipher.decrypt("wßssp!"));
    }
}
