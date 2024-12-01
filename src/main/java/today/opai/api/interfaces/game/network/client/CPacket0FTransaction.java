package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket0FTransaction extends NetPacket {
    int getWindowId();

    short getUid();

    void setUid(short id);

    boolean isAccepted();
}
