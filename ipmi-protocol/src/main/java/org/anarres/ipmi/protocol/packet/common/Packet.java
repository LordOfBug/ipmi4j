package org.anarres.ipmi.protocol.packet.common;

import java.net.SocketAddress;
import javax.annotation.Nonnull;
import org.anarres.ipmi.protocol.client.visitor.IpmiClientRmcpMessageHandler;
import org.anarres.ipmi.protocol.client.visitor.IpmiHandlerContext;
import org.anarres.ipmi.protocol.packet.rmcp.Encapsulation;
import org.anarres.ipmi.protocol.packet.rmcp.RmcpData;

/**
 * A packet to be sent or read from network (UDP packet)
 * @author shevek
 */
public interface Packet extends Wireable, Encapsulation {

    /**
     * Returns the remote address from which this packet was received, or to which it will be sent.
     */
    @Nonnull
    public SocketAddress getRemoteAddress();

    /**
     * Returns the RMCP payload of this packet.
     */
    // @CheckForNull
    public RmcpData getData();

    public <T extends RmcpData> T getData(@Nonnull Class<T> type);

    /**
     * Sets the RMCP payload of this packet.
     */
    @Nonnull
    public Packet withData(@Nonnull RmcpData data);

    public void apply(@Nonnull IpmiClientRmcpMessageHandler handler, @Nonnull IpmiHandlerContext context);
}
