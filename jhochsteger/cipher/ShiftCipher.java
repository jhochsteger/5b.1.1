package jhochsteger.cipher;

public class ShiftCipher extends MonoAlphabeticCipher{
    public ShiftCipher(int value) {
        setShiftValue(value);
    }

    public void setShiftValue(int value){
        String standardsecretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        String secretAlphabet = "";
        for (int i = 0; i < standardsecretAlphabet.length(); i++) {
            secretAlphabet += standardsecretAlphabet.charAt((i+value)%standardsecretAlphabet.length());
        }
        super.setSecretAlphabet(secretAlphabet);
    }
}
