package today.opai.api.interfaces.game.network.client;

import today.opai.api.dataset.PositionData;
import today.opai.api.dataset.RotationData;
import today.opai.api.interfaces.dataset.Vector3d;

public interface CPacket06PositionRotation extends CPacket03Player {
    double getX();

    double getY();

    double getZ();

    Vector3d getPosition();

    void setX(double x);

    void setY(double y);

    void setZ(double z);

    void setPosition(PositionData positionData);

    float getYaw();

    float getPitch();

    RotationData getRotation();

    void setYaw(float yaw);

    void setPitch(float pitch);

    void setRotation(RotationData rotation);
}
