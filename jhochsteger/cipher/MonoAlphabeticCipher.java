package jhochsteger.cipher;

/**
 * A Class that implements two methods from the Interface Cipher.
 * @author Jonas Hochsteger
 * @version 14-11-2020
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet, standardsecretAlphabet;

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
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            encrypted += secretAlphabet.charAt(standardsecretAlphabet.indexOf(text.charAt(i)));
        }
        return encrypted;
    }

    @Override
    public String decrypt(String text) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            decrypted += standardsecretAlphabet.charAt(secretAlphabet.indexOf(text.charAt(i)));
        }
        return decrypted;
    }
}
