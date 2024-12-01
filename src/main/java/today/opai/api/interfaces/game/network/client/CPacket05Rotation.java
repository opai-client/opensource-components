package today.opai.api.interfaces.game.network.client;

import today.opai.api.dataset.RotationData;

public interface CPacket05Rotation extends CPacket03Player {
    float getYaw();

    float getPitch();

    RotationData getRotation();

    void setYaw(float yaw);

    void setPitch(float pitch);

    void setRotation(RotationData rotation);
}
