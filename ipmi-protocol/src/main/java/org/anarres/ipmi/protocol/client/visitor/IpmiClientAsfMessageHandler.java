/*
 * This file is autogenerated.
 */
package org.anarres.ipmi.protocol.client.visitor;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.IpmiEndpoint;
import org.anarres.ipmi.protocol.packet.asf.AsfRmcpData;
import org.anarres.ipmi.protocol.packet.asf.AsfResetData;
import org.anarres.ipmi.protocol.packet.asf.AsfPowerUpData;
import org.anarres.ipmi.protocol.packet.asf.AsfUnconditionalPowerDownData;
import org.anarres.ipmi.protocol.packet.asf.AsfPowerCycleResetData;
import org.anarres.ipmi.protocol.packet.asf.AsfPresencePongData;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfSystemStateResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfOpenSessionResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfCloseSessionResponseData;
import org.anarres.ipmi.protocol.packet.asf.AsfPresencePingData;
import org.anarres.ipmi.protocol.packet.asf.AsfCapabilitiesRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfSystemStateRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfOpenSessionRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfCloseSessionRequestData;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage1Data;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage2Data;
import org.anarres.ipmi.protocol.packet.asf.AsfRAKPMessage3Data;

/**
 * Autogenerated visitor handler for {@link AsfRmcpData} subclasses.
 *
 * @author shevek
 */
public interface IpmiClientAsfMessageHandler {

    public static class Adapter implements IpmiClientAsfMessageHandler {

        public void handleDefault(@Nonnull IpmiEndpoint context, @Nonnull AsfRmcpData message) {
        }

        @Override
        public void handleAsfResetData(IpmiEndpoint context, AsfResetData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfPowerUpData(IpmiEndpoint context, AsfPowerUpData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfUnconditionalPowerDownData(IpmiEndpoint context, AsfUnconditionalPowerDownData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfPowerCycleResetData(IpmiEndpoint context, AsfPowerCycleResetData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfPresencePongData(IpmiEndpoint context, AsfPresencePongData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfCapabilitiesResponseData(IpmiEndpoint context, AsfCapabilitiesResponseData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfSystemStateResponseData(IpmiEndpoint context, AsfSystemStateResponseData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfOpenSessionResponseData(IpmiEndpoint context, AsfOpenSessionResponseData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfCloseSessionResponseData(IpmiEndpoint context, AsfCloseSessionResponseData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfPresencePingData(IpmiEndpoint context, AsfPresencePingData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfCapabilitiesRequestData(IpmiEndpoint context, AsfCapabilitiesRequestData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfSystemStateRequestData(IpmiEndpoint context, AsfSystemStateRequestData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfOpenSessionRequestData(IpmiEndpoint context, AsfOpenSessionRequestData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfCloseSessionRequestData(IpmiEndpoint context, AsfCloseSessionRequestData message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfRAKPMessage1Data(IpmiEndpoint context, AsfRAKPMessage1Data message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfRAKPMessage2Data(IpmiEndpoint context, AsfRAKPMessage2Data message) {
            handleDefault(context, message);
        }

        @Override
        public void handleAsfRAKPMessage3Data(IpmiEndpoint context, AsfRAKPMessage3Data message) {
            handleDefault(context, message);
        }
    }

    public void handleAsfResetData(@Nonnull IpmiEndpoint context, @Nonnull AsfResetData message);

    public void handleAsfPowerUpData(@Nonnull IpmiEndpoint context, @Nonnull AsfPowerUpData message);

    public void handleAsfUnconditionalPowerDownData(@Nonnull IpmiEndpoint context, @Nonnull AsfUnconditionalPowerDownData message);

    public void handleAsfPowerCycleResetData(@Nonnull IpmiEndpoint context, @Nonnull AsfPowerCycleResetData message);

    public void handleAsfPresencePongData(@Nonnull IpmiEndpoint context, @Nonnull AsfPresencePongData message);

    public void handleAsfCapabilitiesResponseData(@Nonnull IpmiEndpoint context, @Nonnull AsfCapabilitiesResponseData message);

    public void handleAsfSystemStateResponseData(@Nonnull IpmiEndpoint context, @Nonnull AsfSystemStateResponseData message);

    public void handleAsfOpenSessionResponseData(@Nonnull IpmiEndpoint context, @Nonnull AsfOpenSessionResponseData message);

    public void handleAsfCloseSessionResponseData(@Nonnull IpmiEndpoint context, @Nonnull AsfCloseSessionResponseData message);

    public void handleAsfPresencePingData(@Nonnull IpmiEndpoint context, @Nonnull AsfPresencePingData message);

    public void handleAsfCapabilitiesRequestData(@Nonnull IpmiEndpoint context, @Nonnull AsfCapabilitiesRequestData message);

    public void handleAsfSystemStateRequestData(@Nonnull IpmiEndpoint context, @Nonnull AsfSystemStateRequestData message);

    public void handleAsfOpenSessionRequestData(@Nonnull IpmiEndpoint context, @Nonnull AsfOpenSessionRequestData message);

    public void handleAsfCloseSessionRequestData(@Nonnull IpmiEndpoint context, @Nonnull AsfCloseSessionRequestData message);

    public void handleAsfRAKPMessage1Data(@Nonnull IpmiEndpoint context, @Nonnull AsfRAKPMessage1Data message);

    public void handleAsfRAKPMessage2Data(@Nonnull IpmiEndpoint context, @Nonnull AsfRAKPMessage2Data message);

    public void handleAsfRAKPMessage3Data(@Nonnull IpmiEndpoint context, @Nonnull AsfRAKPMessage3Data message);
}
