package today.opai.api.interfaces.game.network.server;

public interface SPacket14EntityMovement {
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
