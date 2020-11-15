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

    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet) {
        this.secretAlphabet = secretAlphabet;
    }

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
