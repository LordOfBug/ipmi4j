/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.sdr;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiSimpleRequest;

/**
 * [IPMI2] Section 33.11, table 33-5, page 443.
 *
 * @author shevek
 */
public class ReserveSDRRepositoryRequest extends AbstractIpmiSimpleRequest {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.ReserveSDRRepository;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleReserveSDRRepositoryRequest(context, this);
    }
}
