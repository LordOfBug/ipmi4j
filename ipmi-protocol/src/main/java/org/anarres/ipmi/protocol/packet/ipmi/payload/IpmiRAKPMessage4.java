/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.payload;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import org.anarres.ipmi.protocol.client.visitor.IpmiMessageProcessor;
import org.anarres.ipmi.protocol.packet.asf.AsfRsspSessionStatus;
import org.anarres.ipmi.protocol.packet.common.Code;
import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;

/**
 * [IPMI2] Section 13.23 page 153.
 *
 * @author shevek
 */
public class IpmiRAKPMessage4 extends AbstractTaggedIpmiPayload {

    private AsfRsspSessionStatus statusCode;
    public int consoleSessionId;
    private byte[] integrityCheckValue;

    @Override
    public IpmiPayloadType getPayloadType() {
        return IpmiPayloadType.RAKPMessage4;
    }

    @Override
    public Class<? extends AbstractTaggedIpmiPayload> getRequestType() {
        return IpmiRAKPMessage3.class;
    }

    @Override
    public Class<? extends AbstractTaggedIpmiPayload> getResponseType() {
        return IpmiRAKPMessage4.class;
    }

    @Override
    public void apply(IpmiMessageProcessor handler, IpmiEndpoint context, IpmiSession session) {
        handler.handleRAKPMessage4(context, session, this);
    }

    @Override
    public int getWireLength(IpmiPacketContext context) {
        return 8 + integrityCheckValue.length;
    }

    @Override
    protected void toWireUnchecked(IpmiPacketContext context, ByteBuffer buffer) {
        buffer.put(messageTag);
        buffer.put(statusCode.getCode());
        buffer.putChar((char) 0);    // reserved
        toWireIntLE(buffer, consoleSessionId);
        buffer.put(integrityCheckValue);
    }

    @Override
    protected void fromWireUnchecked(IpmiPacketContext context, ByteBuffer buffer) {
        messageTag = buffer.get();
        statusCode = Code.fromBuffer(AsfRsspSessionStatus.class, buffer);
        assertWireBytesZero(buffer, 2);
        consoleSessionId = fromWireIntLE(buffer);
        integrityCheckValue = readBytes(buffer, buffer.remaining());
    }

    @Override
    public void toStringBuilder(StringBuilder buf, int depth) {
        appendHeader(buf, depth, getClass().getSimpleName());
        depth++;
        appendValue(buf, depth, "MessageTag", "0x" + UnsignedBytes.toString(messageTag, 16));
        appendValue(buf, depth, "StatusCode", statusCode);
        appendValue(buf, depth, "ConsoleSessionId", "0x" + Integer.toHexString(consoleSessionId));
        appendValue(buf, depth, "IntegrityCheckValue", toHexString(integrityCheckValue));
    }
}
