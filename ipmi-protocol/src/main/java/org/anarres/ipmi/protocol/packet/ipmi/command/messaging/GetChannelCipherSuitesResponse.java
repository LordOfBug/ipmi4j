/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.messaging;

import java.nio.ByteBuffer;
import org.anarres.ipmi.protocol.packet.common.Code;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiChannelNumber;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiResponse;

/**
 * [IPMI2] Section 22.15, table 22-17, page 290.
 *
 * @author shevek
 */
public class GetChannelCipherSuitesResponse extends AbstractIpmiResponse {

    private IpmiChannelNumber channelNumber;
    private byte[] dataBytes;

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetChannelCipherSuites;
    }

    @Override
    protected int getResponseDataWireLength() {
        return 2 + dataBytes.length;
    }

    @Override
    protected void toWireData(ByteBuffer buffer) {
        if (toWireCompletionCode(buffer))
            return;
        buffer.put(channelNumber.getCode());
        buffer.put(dataBytes);
    }

    @Override
    protected void fromWireData(ByteBuffer buffer) {
        if (fromWireCompletionCode(buffer))
            return;
        channelNumber = Code.fromBuffer(IpmiChannelNumber.class, buffer);
        dataBytes = readBytes(buffer, buffer.remaining());
    }
}
