package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket03Player extends NetPacket {
    boolean isOnGround();

    void setOnGround(boolean onGround);
}
