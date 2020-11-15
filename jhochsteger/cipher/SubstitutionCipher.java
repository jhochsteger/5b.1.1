package jhochsteger.cipher;

/**
 * A Class that extends the class MonoAlphabeticCipher.
 *
 * @author Jonas Hochsteger
 * @version 14-11-2020
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {
    /**
     * A Constructor for the Class SubsstitutionCipher
     * @param secretAlphabet
     */
    public SubstitutionCipher(String secretAlphabet) {
        setSecretAlphabet(secretAlphabet);
    }

    /**
     * A Setter-Method for the secret Alphabet
     * @param secretAlphabet the new secret Alphabet
     */
    public void setSecretAlphabet(String secretAlphabet) {
        String occurredChars = "";
        String standardsecretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        if (secretAlphabet.length() == 30) {
            for (int i = 0; i < secretAlphabet.length(); i++) {
                if (standardsecretAlphabet.indexOf(secretAlphabet.charAt(i)) != -1) {
                    if (occurredChars.indexOf(secretAlphabet.charAt(i)) == -1) {
                        occurredChars += secretAlphabet.charAt(i);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
        super.setSecretAlphabet(secretAlphabet);
    }
}
