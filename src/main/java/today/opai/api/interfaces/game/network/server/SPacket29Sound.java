package today.opai.api.interfaces.game.network.server;

import today.opai.api.dataset.Vec3Data;

public interface SPacket29Sound {
    String getSound();
    Vec3Data getPosition();
    float getVolume();
    float getPitch();
    void setSound(String sound);
    void setPosition(Vec3Data position);
    void setVolume(float volume);
}
