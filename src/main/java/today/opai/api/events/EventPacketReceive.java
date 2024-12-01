package today.opai.api.events;

import today.opai.api.interfaces.game.network.NetPacket;

public class EventPacketReceive extends EventCancelable {
    private final NetPacket packet;

    public EventPacketReceive(NetPacket packet) {
        this.packet = packet;
    }

    public NetPacket getPacket() {
        return packet;
    }
}
