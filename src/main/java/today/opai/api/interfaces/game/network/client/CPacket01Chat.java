package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket01Chat extends NetPacket {
    String getMessage();

    void setMessage(String message);
}
