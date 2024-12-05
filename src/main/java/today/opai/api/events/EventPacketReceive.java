package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import today.opai.api.interfaces.game.network.NetPacket;

@AllArgsConstructor
@Getter
public class EventPacketReceive extends EventCancelable {
    private final NetPacket packet;
}
