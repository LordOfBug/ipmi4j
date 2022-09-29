/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.messaging;

import java.nio.ByteBuffer;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.common.Code;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiChannelNumber;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiRequest;
import org.anarres.ipmi.protocol.packet.ipmi.payload.IpmiPayloadType;

/**
 * [IPMI2] Section 22.15, table 22-17, page 290.
 *
 * @author shevek
 */
public class GetChannelCipherSuitesRequest extends AbstractIpmiRequest {
    // IPMI2: the highest bit is for list type, second to highest bit reserved, only lower 6 bits for list index.
    public static final int MAX_LIST_INDEX = 0x40;
    // each LIST request will return upto to 16 cyper IDs
    public static final int MAX_LIST_CYPHER_SUITES = 0x10;

    public enum ListType {
        ByCipherSuite,
        Supported
    }
    public IpmiChannelNumber channelNumber;
    public IpmiPayloadType payloadType;
    public ListType listType = ListType.Supported;
    public int listIndex;

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetChannelCipherSuites;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleGetChannelCipherSuitesRequest(context, this);
    }

    @Override
    protected int getDataWireLength() {
        return 3;
    }

    @Override
    protected void toWireData(ByteBuffer buffer) {
        buffer.put(channelNumber.getCode());
        buffer.put(payloadType.getCode());
        byte tmp = (byte) (listIndex & 0x3F);
        tmp = setBit(tmp, 7, listType == ListType.ByCipherSuite);
        buffer.put(tmp);
    }

    @Override
    protected void fromWireData(ByteBuffer buffer) {
        channelNumber = Code.fromBuffer(IpmiChannelNumber.class, buffer);
        payloadType = Code.fromBuffer(IpmiPayloadType.class, buffer);
        byte tmp = buffer.get();
        listIndex = tmp & 0x3F;
        listType = getBit(tmp, 7) ? ListType.ByCipherSuite : ListType.Supported;
    }

    @Override
    public void toStringBuilder(StringBuilder buf, int depth) {
        super.toStringBuilder(buf, depth);
        appendValue(buf, depth, "ChannelNumber", channelNumber);
        appendValue(buf, depth, "PayloadType", payloadType);
        appendValue(buf, depth, "ListIndex", listIndex);
        appendValue(buf, depth, "ListType", listType);
    }
}
