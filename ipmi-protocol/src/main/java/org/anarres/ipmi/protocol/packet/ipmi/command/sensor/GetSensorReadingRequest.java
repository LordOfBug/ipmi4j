/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command.sensor;

import org.anarres.ipmi.protocol.client.visitor.IpmiClientIpmiCommandHandler;
import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.ipmi.IpmiCommandName;

/**
 * [IPMI2] Section 35.14, table 35-15, page 470.
 *
 * @author shevek
 */
public class GetSensorReadingRequest extends AbstractIpmiGetSensorRequest {

    @Override
    public IpmiCommandName getCommandName() {
        return IpmiCommandName.GetSensorReading;
    }

    @Override
    public void apply(IpmiClientIpmiCommandHandler handler, IpmiEndpoint context) {
        handler.handleGetSensorReadingRequest(context, this);
    }
}