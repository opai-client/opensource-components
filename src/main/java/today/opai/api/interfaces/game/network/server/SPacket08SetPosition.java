package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.dataset.Vector2f;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket08SetPosition extends NetPacket {
    Vector3d getPosition();

    Vector2f getRotation();

    void setPosition(Vector3d vector3d);

    void setRotation(Vector2f vector2f);
}
