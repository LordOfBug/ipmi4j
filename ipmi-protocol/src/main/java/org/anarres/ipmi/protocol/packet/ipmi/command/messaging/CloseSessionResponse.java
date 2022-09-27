/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.messaging;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiSimpleResponse;

/**
 * [IPMI2] Section 22.19, table 22-24, page 297.
 *
 * @author shevek
 */
public class CloseSessionResponse extends AbstractIpmiSimpleResponse {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.CloseSession;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleCloseSessionResponse(context, this);
    }
}