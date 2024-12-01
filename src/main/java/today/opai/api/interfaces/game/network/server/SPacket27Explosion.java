package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket27Explosion extends NetPacket {
    float getStrength();

    double getX();

    double getY();

    double getZ();

    Vector3d getMotion();

    void setX(double x);

    void setY(double y);

    void setZ(double z);

    void setMotion(Vector3d vector3d);
}
