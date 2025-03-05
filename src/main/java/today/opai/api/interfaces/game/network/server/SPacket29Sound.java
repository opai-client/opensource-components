package today.opai.api.interfaces.game.network.server;

import today.opai.api.dataset.Vec3Data;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket29Sound extends NetPacket {
    String getSound();
    Vec3Data getPosition();
    float getVolume();
    float getPitch();
    void setSound(String sound);
    void setPosition(Vec3Data position);
    void setVolume(float volume);
}
