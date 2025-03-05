package today.opai.api.interfaces.game.network.server;

import today.opai.api.dataset.Vec3Data;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket2AParticles extends NetPacket {
    String getType();
    Vec3Data getPosition();
    Vec3Data getOffset();
    float getSpeed();
    int getCount();
    boolean isLongDistance();
    int[] getArgs();
    void setType(String type);
    void setPosition(Vec3Data position);
    void setOffset(Vec3Data offset);
    void setSpeed(float speed);
    void setCount(int count);
    void setLongDistance(boolean longDistance);
    void setArgs(int[] args);
}
