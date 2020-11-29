package jhochsteger.cipher;

/**
 * An Interface, that has an encryption and decryption Method
 *
 * @author Jonas Hochsteger
 * @version 14-11-2020
 */
public interface Cipher {
    /**
     * A Method to encrypt a given String
     *
     * @param text The text that needs to be encrypted
     * @return the encrypted text
     */
    public String encrypt(String text);

    /**
     * A Method to decrypt a given String
     *
     * @param text The text that needs to be decrypted
     * @return the decrypted text
     */
    public String decrypt(String text);
}
