package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket2CEntitySpawn extends NetPacket {
    int getEntityId();
    int getX();
    int getY();
    int getZ();
    int getType();
    void setEntityId(int entityId);
    void setX(int x);
    void setY(int y);
    void setZ(int z);
    void setType(int type);
}
