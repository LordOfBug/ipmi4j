/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.asf;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientAsfMessageHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;

/**
 * PowerCycleReset.
 * 
 * http://www.dmtf.org/sites/default/files/standards/documents/DSP0136.pdf
 * http://www.dmtf.org/standards/asf
 * Section 3.2.4.1 page 33.
 *
 * @author shevek
 */
public class AsfPowerCycleResetData extends AbstractAsfBootData {

    @Override
    public AsfRmcpMessageType getMessageType() {
        return AsfRmcpMessageType.PowerCycleReset;
    }

    @Override
    public void apply(IpmiClientAsfMessageHandler handler, IpmiEndpoint context) {
        handler.handleAsfPowerCycleResetData(context, this);
    }
}
