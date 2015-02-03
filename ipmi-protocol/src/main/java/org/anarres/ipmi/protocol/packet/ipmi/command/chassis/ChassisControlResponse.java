/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.chassis;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;
import org.anarres.ipmi.protocol.packet.ipmi.command.AbstractIpmiSimpleResponse;
import org.anarres.ipmi.protocol.client.session.IpmiSession;

/**
 * [IPMI2] Section 28.3, table 28-4, page 390.
 *
 * @author shevek
 */
public class ChassisControlResponse extends AbstractIpmiSimpleResponse {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.ChassisControl;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiSession session) {
        handler.handleChassisControlResponse(session, this);
    }
}