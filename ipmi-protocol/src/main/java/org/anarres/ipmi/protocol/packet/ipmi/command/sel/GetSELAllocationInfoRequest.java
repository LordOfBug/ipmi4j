/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.sel;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiSimpleRequest;

/**
 * [IPMI2] Section 31.3, table 31-3, page 424.
 *
 * @author shevek
 */
public class GetSELAllocationInfoRequest extends AbstractIpmiSimpleRequest {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetSELAllocationInfo;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleGetSELAllocationInfoRequest(context, this);
    }
}