package jhochsteger.cipher;

/**
 * A Class that extends the class MonoAlphabeticCipher.
 *
 * @author Jonas Hochsteger
 * @version 29-11-2020
 */
public class ShiftCipher extends MonoAlphabeticCipher {
    /**
     * A Constructor for the class ShiftCipher
     *
     * @param value the Value for how far the alphabet gets shiftet
     */
    public ShiftCipher(int value) {
        setShiftValue(value);
    }

    /**
     * A setter Method that generates a secrec Alphabet thats shiftet by value
     *
     * @param value
     */
    public void setShiftValue(int value) {
        if (value >= 0) {
            String standardsecretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
            String secretAlphabet = "";
            for (int i = 0; i < standardsecretAlphabet.length(); i++) {
                secretAlphabet += standardsecretAlphabet.charAt((i + value) % standardsecretAlphabet.length());
            }
            super.setSecretAlphabet(secretAlphabet);
        }
    }
}
