package today.opai.api.interfaces.game.network.client;

import today.opai.api.dataset.PositionData;
import today.opai.api.interfaces.dataset.Vector3d;

public interface CPacket04Position extends CPacket03Player {
    double getX();

    double getY();

    double getZ();

    Vector3d getPosition();

    void setX(double x);

    void setY(double y);

    void setZ(double z);

    void setPosition(PositionData positionData);
}
