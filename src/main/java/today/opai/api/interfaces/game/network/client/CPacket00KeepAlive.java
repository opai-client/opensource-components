package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket00KeepAlive extends NetPacket {
    int getKey();
}
