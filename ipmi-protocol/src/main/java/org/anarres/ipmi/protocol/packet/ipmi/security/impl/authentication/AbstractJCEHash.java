/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.security.impl.authentication;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nonnull;
import org.anarres.ipmi.protocol.packet.ipmi.security.impl.integrity.AbstractJCEGenericMAC;

/**
 *
 * @author shevek
 */
public abstract class AbstractJCEHash extends AbstractJCEGenericMAC implements Hash {

    public AbstractJCEHash(@Nonnull String algorithm, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
        super(algorithm, key);
    }

    /*
     @Override
     public void doFinal(byte[] out, int offset) throws ShortBufferException {
     int requestedHashLength = getName().getHashLength();
     int actualHashLength = getMac().getMacLength();
     if (requestedHashLength != actualHashLength) {
     byte[] tmp = new byte[requestedHashLength];
     super.doFinal(tmp, 0);
     System.arraycopy(tmp, 0, out, offset, requestedHashLength);
     } else {
     super.doFinal(out, offset);
     }
     }
     */
    @Override
    public byte[] doFinal() {
        byte[] out = super.doFinal();
        int requestedHashLength = getName().getHashLength();
        if (requestedHashLength != out.length)
            throw new IllegalStateException("Unexpected odd hash length in " + this + ": " + requestedHashLength + " != " + out.length);
        return out;
    }
}