/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.payload;

import java.nio.ByteBuffer;
import org.anarres.ipmi.protocol.client.visitor.IpmiMessageProcessor;
import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.client.session.IpmiSession;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;

/**
 *
 * @author shevek
 */
public class OemExplicit extends AbstractIpmiPayload {

    private int oemEnterpriseNumber;    // 3 byte oem iana; 1 byte zero
    private char oemPayloadId;
    private byte[] data;

    @Override
    public IpmiPayloadType getPayloadType() {
        return IpmiPayloadType.OEM_EXPLICIT;
    }

    @Override
    public void apply(IpmiMessageProcessor handler, IpmiEndpoint context, IpmiSession session) {
        handler.handleOemExplicit(context, session, this);
    }

    public int getOemEnterpriseNumber() {
        return oemEnterpriseNumber;
    }

    public void setOemEnterpriseNumber(int oemEnterpriseNumber) {
        this.oemEnterpriseNumber = oemEnterpriseNumber;
    }

    public char getOemPayloadId() {
        return oemPayloadId;
    }

    public void setOemPayloadId(char oemPayloadId) {
        this.oemPayloadId = oemPayloadId;
    }

    @Override
    public int getWireLength(IpmiPacketContext context) {
        return data.length;
    }

    @Override
    protected void toWireUnchecked(IpmiPacketContext context, ByteBuffer buffer) {
        buffer.put(data);
    }

    @Override
    protected void fromWireUnchecked(IpmiPacketContext context, ByteBuffer buffer) {
        data = new byte[buffer.remaining()];
        buffer.get(data);
    }
}
