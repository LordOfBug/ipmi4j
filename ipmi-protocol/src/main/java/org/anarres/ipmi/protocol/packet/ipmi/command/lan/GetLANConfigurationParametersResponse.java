/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.lan;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiConfigurationParametersResponse;

/**
 * [IPMI2] Section 23.2, table 23-3, page 316.
 *
 * @author shevek
 */
public class GetLANConfigurationParametersResponse extends AbstractIpmiConfigurationParametersResponse {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetLANConfigurationParameters;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleGetLANConfigurationParametersResponse(context, this);
    }
}
