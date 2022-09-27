/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.asf;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientAsfMessageHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;

/**
 * Reset.
 * 
 * http://www.dmtf.org/sites/default/files/standards/documents/DSP0136.pdf
 * http://www.dmtf.org/standards/asf
 * Section 3.2.4.1 page 33.
 *
 * @author shevek
 */
public class AsfResetData extends AbstractAsfBootData {

    @Override
    public AsfRmcpMessageType getMessageType() {
        return AsfRmcpMessageType.Reset;
    }

    @Override
    public void apply(IpmiClientAsfMessageHandler handler, IpmiEndpoint context) {
        handler.handleAsfResetData(context, this);
    }
}
