package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket14EntityMovement extends NetPacket {
    int getEntityId();
    double getX();
    double getY();
    double getZ();
    float getYaw();
    float getPitch();
    boolean isOnGround();
    boolean isRotated();
    void setX(double x);
    void setY(double y);
    void setZ(double z);
    void setYaw(float yaw);
    void setPitch(float pitch);
    void setOnGround(boolean onGround);
    void setRotated(boolean rotated);
}
