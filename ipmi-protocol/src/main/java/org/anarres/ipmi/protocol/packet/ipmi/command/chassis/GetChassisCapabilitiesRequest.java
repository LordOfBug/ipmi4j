/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.chassis;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiSimpleRequest;

/**
 *
 * @author shevek
 */
public class GetChassisCapabilitiesRequest extends AbstractIpmiSimpleRequest {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetChassisCapabilities;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleGetChassisCapabilitiesRequest(context, this);
    }
}
