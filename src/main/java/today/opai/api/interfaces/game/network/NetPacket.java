package today.opai.api.interfaces.game.network;

import today.opai.api.events.EventPacketSend;

public interface NetPacket {
    /**
     * Sends the packet to server.
     */
    void sendPacket();

    /**
     * Sends the packet without trigger {@link today.opai.api.interfaces.EventHandler#onPacketSend(EventPacketSend)}
     */
    void sendPacketNoEvent();
}
