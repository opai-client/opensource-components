package today.opai.api.events;

import today.opai.api.interfaces.game.network.NetPacket;

public class EventPacketSend extends EventCancelable {
    private final NetPacket packet;

    public EventPacketSend(NetPacket packet) {
        this.packet = packet;
    }

    public NetPacket getPacket() {
        return packet;
    }
}
