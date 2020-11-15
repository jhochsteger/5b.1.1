package jhochsteger.cipher;

/**
 * A Class that implements two methods from the Interface Cipher.
 * @author Jonas Hochsteger
 * @version 14-11-2020
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet, standardsecretAlphabet;

    /**
     * A Constructor for the Class MonoAlphabeticCipher
     */
    public MonoAlphabeticCipher(){
        secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        standardsecretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
    }

    /**
     * A Getter-Method for the secret Alphabet
     * @return the secret Alphabet
     */
    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    /**
     * A Setter-Method for the secret Alphabet
     * @param secretAlphabet the new secret Alphabet
     */
    protected void setSecretAlphabet(String secretAlphabet) {
        this.secretAlphabet = secretAlphabet;
    }

    /**
     * A Method that encrypts a given String
     * @param text The text that needs to be encrypted
     * @return The encrypted String
     */
    @Override
    public String encrypt(String text) {
        text = text.toLowerCase();
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            if (standardsecretAlphabet.indexOf(text.charAt(i)) != -1) {
                encrypted += secretAlphabet.charAt(standardsecretAlphabet.indexOf(text.charAt(i)));
            } else {
                encrypted += text.charAt(i);
            }
        }
        return encrypted;
    }

    /**
     * A Method that decrypts a given String
     * @param text The text that needs to be decrypted
     * @return The decrypted String
     */
    @Override
    public String decrypt(String text) {
        text = text.toLowerCase();
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            if (secretAlphabet.indexOf(text.charAt(i)) != -1) {
                decrypted += standardsecretAlphabet.charAt(secretAlphabet.indexOf(text.charAt(i)));
            } else {
                decrypted += text.charAt(i);
            }
        }
        return decrypted;
    }
}
