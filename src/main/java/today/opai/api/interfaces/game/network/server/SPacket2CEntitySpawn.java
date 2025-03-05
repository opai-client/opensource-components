package today.opai.api.interfaces.game.network.server;

public interface SPacket2CEntitySpawn {
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
